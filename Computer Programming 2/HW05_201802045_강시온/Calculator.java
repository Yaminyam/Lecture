import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	// �� ��庰�� index�� �ο�
	final int INPUT_MODE = 0;
	final int RESULT_MODE = 1;
	final int ERROR_MODE = 2;
	int displayMode;

	boolean clearOnNextDigit; // ȭ�鿡 ǥ�õ� ���ڸ� ������ ���� �����ϴ� �༮

	double lastNumber; // �������� ���� ��
	String lastOperator; // �������� ���� �����ڸ� ���.

	private JTextField output; // ���ڰ� ǥ�õ� ����
	private JButton buttons[]; // �� ��ư�� �迭�� ������ ����.
	private JPanel masterPanel, btnPanel, ctrPanel; // ��ư�� ���̺��� ��ġ�� ����

	// GUI�� �����غ���.
	public Calculator() {

		setBackground(Color.gray); // �������� ����� ȸ��

		masterPanel = new JPanel();

		output = new JTextField("0"); // ���̺��� �ʱ� ���� 0

		buttons = new JButton[17];

		btnPanel = new JPanel();

		// ���� ��ư ����0����9����.
		for (int i = 0; i <= 9; i++) {
			buttons[i] = new JButton(String.valueOf(i));
		}

		// ���� ��ư ����.
		buttons[10] = new JButton("=");
		buttons[11] = new JButton("/");
		buttons[12] = new JButton("*");
		buttons[13] = new JButton("-");
		buttons[14] = new JButton("+");

		// ��Ʈ�� ��ư ����.
		buttons[15] = new JButton("back");
		buttons[16] = new JButton("C");

		// �гο� ���ڹ�ư �� ������ ��ư ��ġ
		btnPanel.setLayout(new GridLayout(4, 5, 2, 2));

		for (int i = 7; i <= 9; i++) {
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[11]); // /

		for (int i = 4; i <= 6; i++) {
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[12]); // *

		for (int i = 1; i <= 3; i++) {
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[13]); // -

		btnPanel.add(buttons[0]); // 0
		btnPanel.add(buttons[15]); //back
		btnPanel.add(buttons[14]); // +
		btnPanel.add(buttons[10]); // =

		// ��Ʈ�� �гο� ��Ʈ�� ��ư�� ��ġ
		ctrPanel = new JPanel();
		ctrPanel.setLayout(new GridLayout(0, 4, 4, 4));

		ctrPanel.add(buttons[16]);

		// �� ������Ʈ�� �����ӿ� �߰�
		masterPanel.setLayout(new BorderLayout());
		masterPanel.add(ctrPanel, BorderLayout.NORTH);
		masterPanel.add(btnPanel, BorderLayout.SOUTH);

		getContentPane().add(output);
		getContentPane().add(masterPanel, BorderLayout.SOUTH);
		requestFocus();

		// ��ư ActionListener Ȱ��
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}

		clearAll(); // ��� ���� �ʱ�ȭ

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	// ���콺 �Է¿� ���� ����
	@Override
	public void actionPerformed(ActionEvent e) {

		double result = 0;

		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i]) {
				if (i < 10) {
					addToDisplay(i);
					break;
				} else {
					switch (i) {
					case 10: // =
						processEquals();
						break;
					case 11: // /
						processOperator("/");
						break;
					case 12: // *
						processOperator("*");
						break;
					case 13: // -
						processOperator("-");
						break;
					case 14: // +
						processOperator("+");
						break;
					case 15: // back
						backspace();
						break;
					case 16: // c
						clearAll();
						break;
					}
				}
			}
		}
	}

	private void clearAll() {
		setDisplayString("0");
		lastOperator = "0";
		lastNumber = 0;
		displayMode = INPUT_MODE;
		clearOnNextDigit = true;
	}

	private void backspace() {
		if (displayMode != ERROR_MODE) {
			setDisplayString(getDisplayString().substring(0, getDisplayString().length() - 1));

			if (getDisplayString().length() < 1)
				setDisplayString("0");
		}
	}

	private void processOperator(String string) {
		if (displayMode != ERROR_MODE) {
			double numberInDisplay = getNumberInDisplay();
			if (!lastOperator.equals("0")) {
				try {
					double result = processLastOperator();
					displayResult(result);
					lastNumber = result;
				} catch (Exception e) {
				}

			} else {
				lastNumber = numberInDisplay;
			}

			clearOnNextDigit = true;
			lastOperator = string;
		}
	}

	private double processLastOperator() throws Exception {
		double result = 0;
		double numberInDisplay = getNumberInDisplay();
		if (lastOperator.equals("/")) {
			if (numberInDisplay == 0)
				throw (new Exception());
			result = lastNumber / numberInDisplay;
		}

		if (lastOperator.equals("*")) {
			result = lastNumber * numberInDisplay;
		}
		if (lastOperator.equals("-")) {
			result = lastNumber - numberInDisplay;
		}
		if (lastOperator.equals("+")) {
			result = lastNumber + numberInDisplay;
		}

		return result;
	}

	private void processEquals() {
		double result = 0;
		if (displayMode != ERROR_MODE) {
			try {
				result = processLastOperator();
				displayResult(result);
			} catch (Exception e) {
				displayError("������ ���� �� �����ϴ�.");
			}
			lastOperator = "0";
		}
	}

	private void displayResult(double result) {
		setDisplayString(Double.toString(result));
		lastNumber = result;
		displayMode = RESULT_MODE;
		clearOnNextDigit = true;
	}

	private void displayError(String error) {
		setDisplayString(error);
		lastNumber = 0;
		displayMode = ERROR_MODE;
		clearOnNextDigit = true;
	}

	private double getNumberInDisplay() {
		String input = output.getText();
		return Double.parseDouble(input);
	}

	private void addToDisplay(int i) {
		if (clearOnNextDigit)
			setDisplayString("");

		String inputString = getDisplayString();

		if (inputString.indexOf("0") == 0) {
			inputString = inputString.substring(1);
		}
		if (!inputString.equals("0") || i > 0) {
			setDisplayString(inputString + i);
		}

		displayMode = INPUT_MODE;
		clearOnNextDigit = false;
	}

	private void setDisplayString(String string) {
		output.setText(string);
	}

	private String getDisplayString() {
		return output.getText();
	}

	public static void main(String args[]) {
		Calculator cal = new Calculator();
		cal.setTitle("Calculator");
		cal.setSize(300, 300);
		cal.pack();
		cal.setVisible(true);
		cal.setResizable(false);
	}

}