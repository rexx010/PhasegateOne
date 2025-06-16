phonebookList = []

def addContact(firstName, lastName, PhoneNumber):
    if len(PhoneNumber) != 11 and PhoneNumber[0] != '0' and  PhoneNumber[2] != '0':
        print("invalid length or invalid number... Try again");
    elif PhoneNumber[1] != '7' and PhoneNumber[1] != '8' and PhoneNumber[1] != '9':
        print("Error, second number should be 7, 8, or 9... Try again");
    else:

        contact = [];
        contact.append(firstName);
        contact.append(lastName);
        contact.append(PhoneNumber);
        phonebookList.append(contact);
        return phonebookList;



def viewContact():
    for items in phonebookList:
        print(*items);
    print();


def removeContact(name):
    for index, items in enumerate(phonebookList):
        if(items[0] == name):
            del phonebookList[index];


def searchByPhone(phone):
    if len(PhoneNumber) != 11 and PhoneNumber[0] != '0' and  PhoneNumber[2] != '0':
        print("invalid length or invalid number... Try again");
    elif PhoneNumber[1] != '7' and PhoneNumber[1] != '8' and PhoneNumber[1] != '9':
        print("Error, second number should be 7, 8, or 9... Try again");
    else:
        for item in phonebookList:
            if(item[2] == phone):
                return item


def searchByfirstname(firstname):
    for item in phonebookList:
        if(item[0] == firstname):
            return item;



def searchBysecondname(secondName):
    checking = [];
    for item in phonebookList:
        if(item[1] == secondName):
            return item;



def EditContact(firstN):
    checking = [];
    for index, item in enumerate(phonebookList):
        if(item[0] == firstN):
            print("Enter new first name");
            first = input();
            print("Enter new second name");
            second = input();
            print("Enter new phone number");
            phone = input();
            
            checking.append(first);
            checking.append(second);
            checking.append(phone);
            
            phonebookList[index] = checking;












