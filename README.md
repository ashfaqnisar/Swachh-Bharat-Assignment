# KIOWR - A Swachh Bharat Scheme

## Introduction to KIOWR
KIOWR(**Kiosk Wastage Recycler**). The wastage recycler recycles different types of waste such as
- Glass
- Metal
- Plastic

KIOWR is a wastage recycler program, which takes the waste provided by the user and then returns a 
coupon to the User as token of gratitude.

The KIOWR has a application running in it, which handles all the **functionalities to recycle** the 
waste. The program, first **retrieve's the user details** and then **stores it** in an XML file. Then, the
program **retrieve's the waste details** from the user and **generates the weight** of the waste and 
based on the weight, we are going to **generate the coupon points** for the user.

## About Project:

### App Execution Flow:
At the beginning of the execution, the **App.java file will be executed**. The App.java consists of 
three objects and they are
- Register
- Waste
- Coupon

**Register:** The register.class contains the **UserData Object**, which holds the **username, email, number and address** values.

**Waste:** The waste.class contains the **WasteData Object**, which holds the **WasteTypeData and WasteBrandData object**.

**Coupon:** The coupon.class contains the **CouponData Object**, which holds the **CouponCode and CouponPoints values**

The below diagram is the data flow of the program and how the data flows in the project.

**UI Package:**
The **UI package** contains all the files, which are used to **display in the front end**.
Below is the Flow Diagram for the UI Package.
[Image](src/main/diagrams/UI.png)

**Other Package**
The other package contains the following files, these files are **not directly used** in the front 
end **but supports the UI files.**
- **Saver**: The saver file is used for **storing reports**, users and any other data, which is to
 be stored in an xml.

- **Reader:** The reader file is used to **read the data** from any file in the system.

- **Validator**: The validator file is used to **validate all the inputs** in the project.

- **OutputGenerator:** The outputGenerator is responsible for the **printing of the report data**.
The below is the diagram for the Other Package
[CouponsImage](src/main/diagrams/Other.png)

**Util Package**:
The util package contains two files and they are:
- **RegularExpClass**
- **XMLHandler**: For handling all the XML functions and for **easy write, read**;

### Data Flow:
The below diagram repesents the **data flow of the project**. With help of this, we can easily help 
the user **understand more about the flow of the project**"

The Model Package contains the following files
[image2](src/main/diagrams/POJO.png);

## Assumptions
1. First assumption is regarding the execution of the project, the user will be running the 
program(JAR File) from **different terminals at the same time**. 

2. Instead of **generating the weight randomly**, we are going to **fetch the weights** from the file
.Based on the **type and brand of waste** and then **fetch the current points** from the weights.
3. New user will be created for **every new session**.
## Technology Stack
### Dependencies Used:
1. **XStream:** The xstream is used for handling the conversion of the **XML file to POJO object** and **POJO object to XML file**.

2. **Apache XML Serializer:** The Apache XML serializer is used to **serialize the XML**.
### Plugins Used: 

1. **maven-site-plugin:** Used the maven-site-plugin, to get more information on the **statistics of the whole project**.

2. **maven-shade-plugin:** To attach all the **dependencies to the project**.


## Installation
- **Clone this repository** and extract the **zip to a folder**.
- Open the **CMD/Terminal** prompt, inside the folder.
- Inorder to run the application, **execute the below command**.
```bash
java -cp target/swachh-bharat.jar com.rubicon.swachh.App
```

## Final Solution
There are mainly four parts in the final solution and they are:
 - User Generation
 - Selection of the Type of waste.
 - Selection of the Brand of the waste.
 - Generating The Final Report.

### User Generation:
In the new user generation part, the user will be **registering himself**. The users details are 
appended to the Users.xml, which is present at **src/main/data/users/users.xml** As shown in the command 
prompt below.
```bash
Registration:
Hello There, Please provide your name: Ashfaq Nisar

Hi Ashfaq Nisar, can you please provide your email address: ashfaqnisar00@gmail.com

Hey Ashfaq Nisar, please provide your number: 8328277518

Hey Ashfaq Nisar, can you provide your address: 13-6-429/1,Hyderabad

Please select the type of wastage, which you will be depositing in the Kiosk

```

### Selection of the Type of the Waste:
Now, the user will be asked to **select the type of the waste**, which is to be recycled. As shown below in the output.
```bash
Please select the type of wastage, which you will be depositing in the Kiosk
        1. Glass
        2. Plastic
        3. Metal
Enter Option: 2
Plastic has been selected.

```

### Selection of the Brand of the Waste: 
In this part of the project, the user will be asked to **select a brand for the waste**. As shown below in the prompt:

```bash
Please, provide the brand of the Plastic if known, else select the other option
        1. Spirte
        2. Coke
        3. Diet Coke
        4. Thumbs Up
        5. Other
Enter Option: 3
Diet Coke Brand has been selected.


```


### Generating the Final Report: 
In the final report, **all the details** of the **waste type and waste brand and user information** are displayed.
The report is stored at the place src/main/data/reports/report-file.xml

```bash 
_____________________________________________________________________________________________
|                                                                                            |
|                                    Swachh Bharat Kiosk                                     |
|                                                                                            |
|--------------------------------------------------------------------------------------------|
| Recycled By:Ashfaq                                                                         |
| User Email: ashfaqnisar00@gmail.com                                                        |
| User Phone: 8328277518                                                                     |
| Total Waste Items: 3                                                                       |
| Detailed Information About Waste:                                                          |
+------------+------------------------+------------------------+--------------+--------------+
|    S.No    |    Type of Wastage     |    Brand of Wastage    |    Weight    |    Points    |
+------------+------------------------+------------------------+--------------+--------------+
|     1      |         Glass          |       Diet Coke        |      45      |      29      |
|     2      |        Plastic         |        Thumbsup        |      25      |      19      |
|     3      |         Metal          |         Sprite         |      35      |      24      |
+------------+------------------------+------------------------+--------------+--------------+
| Total Weight: 105     Total Coupon Points: 72                                              |
| The coupon code is: lfwzg41                                                                |
| Thank you, for contributing towards a Swachh Bharat                                        |
|                                                                                            |
|____________________________________________________________________________________________|


```

