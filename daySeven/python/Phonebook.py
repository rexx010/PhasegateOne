import PhonebookFunction

print("What is your name?");
userName = input();
print();

message = """
press 1 to Add contact.
press 2 to View contact.
press 3 to Remove contact.
press 4 to Find contact by phone number.
press 5 to Find contact by first name.
press 6 to Find contact by last name.
press 7 to Edit contact.
press 0 to Exist Phonebook.
""";
myCondition = True;
while(myCondition):
    print(f"Welcome to your phonebook app MR. {userName}");
    print(message);
    print();
    userChoice = input();
    match(userChoice):
        case "1":
            print("To add contact...");
            print("Enter the first name...");
            firstName = input();
            print("Enter the second name...");
            secondtName = input();
            print("Enter the phone number...");
            phoneNumber = input();
            print();
            print("Contact saved...");
            print(f"{firstName} {secondtName} : {phoneNumber}");
            print();
            PhonebookFunction.addContact(firstName, secondtName, phoneNumber);

        case "2":
            PhonebookFunction.viewContact();
            print();

        case "3":
            print("Search contact by name");
            contactName = input();
            PhonebookFunction.removeContact(contactName);
            print("Contact deleted...");
            print();

        case "4":
            print("Search contact by phoneNumber");
            contactPhone = input();
            print();
            checking = [];
            checking = PhonebookFunction.searchByPhone(contactPhone);
            for item in checking:
                print(item, end=" ");
            print();

        case "5":
            print("Search contact by first name");
            contactFirstName = input();
            print();
            checking = [];
            checking = PhonebookFunction.searchByfirstname(contactFirstName);
            for item in checking:
                print(item, end=" ");
            print();

        case "6":
            print("Search contact by first name");
            contactSecondName = input();
            print();
            checking = [];
            checking = PhonebookFunction.searchBysecondname(contactSecondName);
            for item in checking:
                print(item, end=" ");
            print();

        case "7":
            print("Enter the contact's first name to edit the contact info");
            firstN = input();
            print();
            PhonebookFunction.EditContact(firstN);
            print("Contact edited");
            print();

        case "0":
            myCondition = False;
            print("Goodbye...");

        case _:
            print("Invalid input... Try again");
 




