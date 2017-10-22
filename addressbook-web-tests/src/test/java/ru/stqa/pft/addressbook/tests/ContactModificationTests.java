package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Admin on 22.10.2017.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() {
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Updatedfirstname", "UpdatedMiddleName",
                "UpdatedlastName", "Nickname", "Parnter",
                "no second house", "Luxoft",
                "Updated Address line 1,\naddressline2", "38067842",
                "35148", "526541", "478461",
                "UpdatedEmail@gmail.com", "30215", "Notes text..."));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToMainPage();
    }
}