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
            while True:
                print("Enter the phone number...");
                PhoneNumber = input();
                if len(PhoneNumber) != 11 and PhoneNumber[0] != '0' and  PhoneNumber[2] != '0':
                    print("invalid length or invalid number... Try again");
                elif PhoneNumber[1] != '7' and PhoneNumber[1] != '8' and PhoneNumber[1] != '9':
                    print("Error, second number should be 7, 8, or 9... Try again");
                else:

                    print();
                    print(f"{firstName} {secondtName} : {PhoneNumber}");
                    print();
                    PhonebookFunction.addContact(firstName, secondtName, PhoneNumber);
                    break;
        case "2":
            PhonebookFunction.viewContact();
            print();

        case "3":
            print("Search contact by name");
            contactName = input();
            output = PhonebookFunction.removeContact(contactName);
            print(output);
            print();

        case "4":
            while True:
                print("Search contact by phoneNumber");
                PhoneNumber = input();
                if len(PhoneNumber) != 11 and PhoneNumber[0] != '0' and  PhoneNumber[2] != '0':
                    print("invalid length or invalid number... Try again");
                elif PhoneNumber[1] != '7' and PhoneNumber[1] != '8' and PhoneNumber[1] != '9':
                    print("Error, second number should be 7, 8, or 9... Try again");
                else:
                    print();
                    checking = PhonebookFunction.searchByPhone(PhoneNumber);
                    print(checking);
                    print();
                    break;

        case "5":
            print("Search contact by first name");
            contactFirstName = input();
            print();
            checking = PhonebookFunction.searchByfirstname(contactFirstName);
            print(checking);
            print();

        case "6":
            print("Search contact by last name");
            contactSecondName = input();
            print();
            checking = PhonebookFunction.searchBysecondname(contactSecondName);
            print(checking);
            print();

        case "7":
            print("Enter the contact's first name to edit the contact info");
            firstN = input();
            print();
            info = PhonebookFunction.EditContact(firstN);
            print(info);
            print();

        case "0":
            myCondition = False;
            print("Goodbye...");

        case _:
            print("Invalid input... Try again");
 




