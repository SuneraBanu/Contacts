package collections;

import java.util.*;

class Process
{
//Adding Contacts
public void addNew(Map<String, HashMap<String,String>> hashMap)
{
  System.out.println("Added Successfully....." + hashMap);
}
//Adding in Existing Contact
public void addExisting(String name, String no, Map<String, HashMap<String,String>> map)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Name");
   String nameToSearch = sc.nextLine();
   if(name.equals(nameToSearch))
   {
     System.out.println("Do you want to add another number???? \n1.LandlineNumber \n2.Exit");
     int o;
     o = Integer.parseInt(sc.nextLine());

       switch(o)
       {
       case 1:
       System.out.println("Landline Number");
       String lno = sc.nextLine();
       map.get(name).put("LandlineNumber",lno);
       System.out.println("Added......");
       System.out.println(map);
       break;

       case 2:
       System.exit(0);
       break;

       default:
       System.out.println("Enter Correctly");
       System.exit(0);
       }

   }else
   {
     System.out.println("Please add your contact...");
   }
}
//Showing contacts
public void showContacts(String name)
{
	
   System.out.println(name);
}
//Searching Contacts
public void search(String name, Map<String, HashMap<String,String>> map)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Name");
   String nameToSearch = sc.nextLine();
   if(name.equals(nameToSearch))
   {
     System.out.println("****** CONTACTS ******");
     System.out.println("Choose what you want to see ??? \n1. MobileNumber \n2. LandlineNumber \n3. Both");
     System.out.println("Enter the number to proceed : ");
     int option = Integer.parseInt(sc.nextLine());
     if(option == 1)
     {
       String s1 = map.get(name).get("Number");
       System.out.println("Number -> "+s1);
     }
     else if(option == 2)
     {
       String s2 = map.get(name).get("LandlineNumber");
       System.out.println("LandlineNumber -> "+s2);
     }
     else
     {
       String s3 = map.get(name).get("Number");
       System.out.println("Number -> "+s3);
       String s4 = map.get(name).get("LandlineNumber");
       System.out.println("LandlineNumber -> "+s4);
     }
   }
}
}
//Implementing all the methods 
class contact
{
public static void main(String ar[])
{
  Process process = new Process();

  Scanner scan = new Scanner(System.in);
  int l;
  Map<String, HashMap<String,String>> map = new HashMap<String, HashMap<String,String>>();
  String name="",no="";


  do
  {
  System.out.println("****** CONTACTS ******");
  System.out.println("1. Add New Contacts \n2. Add Existing Contacts \n3. Show Contacts \n4. Search \n5. Exit \n");
  System.out.println("Enter the number to proceed : ");
  l = Integer.parseInt(scan.nextLine());

  switch(l)
  {
  case 1:
  System.out.println("Name: ");
  name = scan.nextLine();
  System.out.println("Number: ");
  no = scan.nextLine();
  map.put(name,new HashMap<String,String>());
  map.get(name).put("Number",no);
  process.addNew(map);
  break;

  case 2:
  process.addExisting(name,no,map);
  break;

  case 3:
  process.showContacts(name);
  break;

  case 4:
  process.search(name,map);
  break;

  case 5:
  System.exit(0);
  break;

  default:
  System.exit(0);
  }
}while(l!=5);
}
}

Output:
****** CONTACTS ******
1. Add New Contacts 
2. Add Existing Contacts 
3. Show Contacts 
4. Search 
5. Exit 

Enter the number to proceed : 
1
Name: 
Sunera
Number: 
987654321
Added Successfully.....{Sunera={Number=987654321}}
****** CONTACTS ******
1. Add New Contacts 
2. Add Existing Contacts 
3. Show Contacts 
4. Search 
5. Exit 

Enter the number to proceed : 
2
Enter your Name
Sunera
Do you want to add another number???? 
1.LandlineNumber 
2.Exit
1
Landline Number
044123456
Added......
{Sunera={LandlineNumber=044123456, Number=987654321}}
****** CONTACTS ******
1. Add New Contacts 
2. Add Existing Contacts 
3. Show Contacts 
4. Search 
5. Exit 

Enter the number to proceed : 
3
Sunera
****** CONTACTS ******
1. Add New Contacts 
2. Add Existing Contacts 
3. Show Contacts 
4. Search 
5. Exit 

Enter the number to proceed : 
4
Name
Sunera
****** CONTACTS ******
Choose what you want to see ??? 
1. MobileNumber 
2. LandlineNumber 
3. Both
Enter the number to proceed : 
1
Number -> 987654321
****** CONTACTS ******
1. Add New Contacts 
2. Add Existing Contacts 
3. Show Contacts 
4. Search 
5. Exit 

Enter the number to proceed : 
5
