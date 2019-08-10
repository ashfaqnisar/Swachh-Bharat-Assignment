# KIOWR - A Swachh Bharat Scheme

## Introduction to KIOWR
KIOWR(Kiosk Wastage Recycler). The wastage recycler recycles different types of waste such as
- Glass
- Metal
- Plastic

## Problem Statement

## Assumptions

## Technology Stack
### Dependencies Used:
1. **XStream:** The xstream is used for handling the conversion of the XML file to POJO object and POJO object to XML file.

2. **Apache XML Serializer:** The Apache XML serializer is used to serialize the XML.
### Plugins Used: 

1. **maven-site-plugin:** Used the maven-site-plugin, to get more information on the statistics of the whole project.

2. **maven-shade-plugin:** To attach all the dependencies to the project.


## Installation
- Clone this repository and extract the zip to a folder
- Open the **CMD/Terminal** prompt, inside the folder.
- Inorder to run the application, execute the below command.
```bash
java -cp target/swachh-bharat.jar com.rubicon.swachh.App
```

## Final Solution
There are mainly four parts in the solution and they are:
 - User Generation
 - Selection of the Type of waste.
 - Selection of the Brand of the waste.
 - Generating The Final Report.

### User Generation:
In the new user generation part, the user will be registering himself. The users details are appended to the Users.xml which is present at As shown in the command prompt below.
```bash
Registration:
Hello There, Please provide your name: Ashfaq Nisar

Hi Ashfaq Nisar, can you please provide your email address: ashfaqnisar00@gmail.com

Hey Ashfaq Nisar, please provide your number: 8328277518

Hey Ashfaq Nisar, can you provide your address: 13-6-429/1,Hyderabad

Please select the type of wastage, which you will be depositing in the Kiosk

```

### Selection of the Type of the Waste:
Now, the user will be asked to select the type of the waste which is to be recycled.As shown below.

```bash
Please select the type of wastage, which you will be depositing in the Kiosk
        1. Glass
        2. Plastic
        3. Metal
Enter Option: 2
Plastic has been selected.

```

### Selection of the Brand of the Waste: 
In this part of the project, the user will be asked to select a brand for the waste. 
As shown below in the prompt:

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
In the final report, all the details of the waste type and waste brand and user information are displayed.
The report is also stored at src/main/data/reports/report-file.xml

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

