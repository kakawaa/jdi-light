package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.complex.Droplist;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.base.Combobox;
import com.epam.jdi.light.ui.html.base.MultiDropdown;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Checkbox;
import com.epam.jdi.light.ui.html.common.TextArea;
import com.epam.jdi.light.ui.html.common.TextField;

@Url("/contacts.html") @Title("Contact Form")
public class ContactsPage extends WebPage {
	TextField name, lastName, position, passportNumber, passportSeria;

	Droplist gender;
	Combobox religion;
	// MultiDropdown
	MultiDropdown weather;

	Checkbox passport, acceptConditions;
	TextArea description;

	@UI("['Submit']") public Button submit;
}