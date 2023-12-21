/**
 * Author: Chu Việt Anh
 */
package Screen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Exception.DuplicatedItemException;
import Store.Aims;
import Media.Book;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
	private JTextField tfTitle;
	private JTextField tfCategory;
	private JTextField tfAuthors;
	private JTextField tfCost;

	public AddBookToStoreScreen() {
		super("Book");

		JPanel center = createCenter();
		tfTitle = addInputField("Title: *", center);
		tfCategory = addInputField("Category:", center);
		tfAuthors = addInputField("Author(s):", center);
		tfCost = addInputField("Cost: *", center);
		center.add(Box.createRigidArea(new Dimension(10, 40)));

		add(center, BorderLayout.CENTER);
		add(createSouth(new ButtonListener()), BorderLayout.SOUTH);

		setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "OK": {
				if (tfTitle.getText().equals("") || tfCost.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Some required fields are empty!", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				try {
					Book book = new Book(tfTitle.getText(), tfCategory.getText(), Float.parseFloat(tfCost.getText()));
					for (String author : tfAuthors.getText().split(",\\s*")) {
						book.addAuthor(author);
					}

					Aims.getStore().addMedia(book);
					Aims.getStoreScreen().loadItemsToStore();

					setVisible(false);
					JOptionPane.showMessageDialog(null, "New Book added to store!");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Cost must be a decimal value!", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (DuplicatedItemException e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
				break;
			case "Cancel":
				setVisible(false);
				break;
			}
		}

	}

}

