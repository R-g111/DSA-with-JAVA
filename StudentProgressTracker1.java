//STUDENT PROGRESS TRACKER
//NAME:GUPTA RAJESHWARI
//BATCH:A2
//DATE:29/09/2023
//ENROLLMENT NO.:22002171410020
//ROLL NO.:60
//SUB:DATA STRUCTURES
// BRANCH:CS&IT
import java.util.*;

class StudentProgressTracker1
{
    public static void main(String[] args) 
    {
        StudentDoublyLinkedList student=new StudentDoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
       System.out.println("-------------Welcome to Student Progress Tracker------------------");
       System.out.println("To get started.....");
        while(true)
        {
            //Taking input from user.
            System.out.println("Enter 1 : Insert Student");
            System.out.println("Enter 2 : Delete Student");
            System.out.println("Enter 3 : Search Student by id");
            System.out.println("Enter 4 : Search Student by name");
            System.out.println("Enter 5 : Update student's marks");
            System.out.println("Enter 6 : Get Students Rank");
            System.out.println("Enter 7 : Display");
            System.out.println("Enter 0 : Exit");

            System.out.println("Enter your choice");
            int choice=scanner.nextInt();

            switch (choice) 
            {
                case 1:    //For Inserting student
                System.out.println("Enter the number of student you want to enter: ");
                int numStudent=scanner.nextInt();
                for (int i = 0; i < numStudent; i++) 
              {
                System.out.println("Enter details for Student " + (i + 1) + ":");
                        
                        // Input student ID
                        System.out.print("Enter Student ID: ");
                        int studentId = scanner.nextInt();
                        if(studentId<=0 || studentId>=1000)
                        { 
                            System.out.println("Such student ID does not exists!");
                        }
                        // Input student name
                        System.out.print("Enter Student Name: ");
                        String name = scanner.next();
                        //test-1 mark.
                        System.out.println("Enter "+name+" test-1 marks :");
                        Double t1_Marks=scanner.nextDouble();
                        if(t1_Marks >25)  //Marks shouldn't be greater than 25
                        {
                            System.out.println("Marks shouldn't be greater than 25");
                        }
                        else if(t1_Marks<0)
                        {
                            System.out.println("Marks shouldn't be less than 0");
                        }
                        else if(!(t1_Marks>0 && t1_Marks<25))  //Checking that marks should range from 0 to 25
                        {
                            System.out.println("Invalid Input!");
                        }
                        System.out.println("Enter "+name+" test-2 marks :");
                        Double t2_Marks=scanner.nextDouble();
                       if(t2_Marks >25)
                        {
                            System.out.println("Marks shouldn't be greater than 25");
                        }
                        else if(t2_Marks<0)
                        {
                            System.out.println("Marks shouldn't be less than 0");
                        }
                        else if(!(t2_Marks>0 && t2_Marks<25))
                        {
                            System.out.println("Invalid Input!");
                        }

                         //Displaying progress of student. Comparing T1 and T2 marks
                          if(t1_Marks<=t2_Marks)    
                          {
                            System.out.println("Congrats! You have stepped up than before! The progress is in plus!");
                          }
                          
                          else
                          {
                            System.out.println("You have got a slight lesser marks than before, don't worry best of luck for next exam!");
                          }

                          //Taking input for test-3 marks
                        System.out.println("Enter "+name+" test-3 marks :");
                        Double t3_Marks=scanner.nextDouble();
                       if(t3_Marks >25)
                        {
                            System.out.println("Marks shouldn't be greater than 25");
                        }
                        else if(t3_Marks<0)
                        {
                            System.out.println("Marks shouldn't be less than 0");
                        }
                        else if(!(t3_Marks>0 && t3_Marks<25))
                        {
                            System.out.println("Invalid Input!");
                        }
                        
                        //Displaying progress of student. Comparing t1 and t3 marks.
                          if(t1_Marks<=t3_Marks && t1_Marks<=25 && t3_Marks<=25)
                          {
                            System.out.println("Congrats! You have stepped up than Test-1! The progress is in plus!");
                          }
                          else
                          {
                            if(t1_Marks<=25 && t3_Marks<=25)
                            {
                            System.out.println("You have got a slight lesser marks than Test-1, don't worry best of luck for next exam!");
                          }
                        }
                          // Comparing t2 and t3 marks.
                          if(t2_Marks<=t3_Marks && t2_Marks<=25 && t3_Marks<=25)
                          {
                            System.out.println("Congrats! You have stepped up than Test-2! The progress is in plus!");
                          }
                          else
                          {
                            if(t2_Marks<=25 && t3_Marks<=25)
                            {
                            System.out.println("You have got a slight lesser marks than Test-2, don't worry best of luck for next exam!");
                          }
                        }

                        //Taking input for test-4 marks.
                        System.out.println("Enter "+name+" test-4 marks :");
                        Double t4_Marks=scanner.nextDouble();
                       if(t4_Marks >25)
                        {
                            System.out.println("Marks shouldn't be greater than 25");
                        }
                        else if(t4_Marks<0)
                        {
                            System.out.println("Marks shouldn't be less than 0");
                        }
                        else if(!(t4_Marks>0 && t4_Marks<25))
                        {
                            System.out.println("Invalid Input!");
                        }

                        //Comparing t1 and t4 marks.
                        if(t1_Marks<=t4_Marks && t1_Marks<=25 && t4_Marks<=25)
                          {
                            System.out.println("Congrats! You have stepped up than Test-1! The progress is in plus!");
                          }
                          else
                          {
                            if(t1_Marks<=25 && t4_Marks<=25 )
                            System.out.println("You have got a slight lesser marks than Test-1, don't worry best of luck for next exam!");
                          }

                          //Comparing t2 and t4 marks.
                          if(t2_Marks<=t4_Marks && t2_Marks<=25 && t4_Marks<=25 )
                          {
                            System.out.println("Congrats! You have stepped up than Test-2! The progress is in plus!");
                          }
                          else
                          {
                            if(t2_Marks<=25 && t4_Marks<=25 )
                            System.out.println("You have got a slight lesser marks than Test-2, don't worry best of luck for next exam!");
                          }

                          //Comparing t3 and t4 marks.
                          if(t3_Marks<=t4_Marks && t3_Marks<=25 && t4_Marks<=25)
                          {
                            System.out.println("Congrats! You have stepped up than Test-3! The progress is in plus!");
                          }
                          else
                          {
                            if(t3_Marks<=25 && t4_Marks<=25)
                            System.out.println("You have got a slight lesser marks than Test-3, don't worry best of luck for next exam!");
                          }
                          
                          //Checking total marks for pass or fail.
                          double total_Marks=t1_Marks+t2_Marks+t3_Marks+t4_Marks;
                          if(total_Marks>=35)
                          {
                            System.out.println("Congratulations!You have passed the exam.");
                          }
                          else if(total_Marks<35)
                          {
                            System.out.println("Sorry! You failed in the exam!");
                          }
                          //Marks Range from 60 to 75....then progress='Good'
                          else if(total_Marks>=60 && total_Marks<75)
                          {
                            System.out.println("Your Progress is good! ");
                          }
                           //Marks Range from 75 to 90....then progress='Great'
                          else if(total_Marks>=75 && total_Marks<90)
                          {
                            System.out.println("Your Progress is Great! Keep it up! ");
                          }
                           //Marks Range from 90 to 100....then progress='Phenomenal'
                          else if(total_Marks>=90 && total_Marks<=100)
                          {
                            System.out.println("Wow!!! Your proress is phenomenal!!Keep it up! ");
                          }
          
          
                        // Create a new student with the input details
                       StudentDetails sdetail = new StudentDetails(studentId, name,t1_Marks,t2_Marks,t3_Marks,t4_Marks);
                       student.insertStudentInOrder(sdetail);
                       System.out.println("=========Details of student==========");
                       student.display();
                       
              }
                    break;

                case 2: //for deleting student.
                System.out.println("Enter the ID of the student that you want to delete :");
                int studentIdToDelete=scanner.nextInt();
                student.deleteStudent(studentIdToDelete);
                System.out.println("Student deleted!");
                  break;

                  case 3:  //To search student by id
                  System.out.println("Enter the ID of the student you want to search :");
                  int searchId=scanner.nextInt();

                  StudentNode temp=student.first;
                  int flag=0;
                  while (temp!=null) {
                    if(temp.studentDetails.studentId==searchId)
                    {
                        flag=1;
                        System.out.println("ID : "+searchId);
                        System.out.println("Name : "+temp.studentDetails.name);
                        System.out.println("Test-1 Marks : "+temp.studentDetails.t1_Marks);
                        System.out.println("Test-2 Marks : "+temp.studentDetails.t2_Marks);
                        System.out.println("Test-3 Marks : "+temp.studentDetails.t3_Marks);
                        System.out.println("Test-4 Marks : "+temp.studentDetails.t4_Marks);
                        System.out.println("Total Marks : "+temp.studentDetails.totalMarks);
                    }
                    temp=temp.next;
                  }
                  if(flag==0)
                  {
                    System.out.println("Student not found.");
                  }
                    break;

                    case 4:  //to search student by name
                    System.out.println("Enter the Name of the student you want to search :");
                  String searchName=scanner.next();
                  StudentNode temp1=student.first;
                  int flag1=0;
                  while (temp1!=null) {
                    if(temp1.studentDetails.name.equalsIgnoreCase(searchName))
                    {
                        flag1=1;
                        System.out.println("ID : "+temp1.studentDetails.studentId);
                        System.out.println("Name : "+temp1.studentDetails.name);
                        System.out.println("Test-1 Marks : "+temp1.studentDetails.t1_Marks);
                        System.out.println("Test-2 Marks : "+temp1.studentDetails.t2_Marks);
                        System.out.println("Test-3 Marks : "+temp1.studentDetails.t3_Marks);
                        System.out.println("Test-4 Marks : "+temp1.studentDetails.t4_Marks);
                        System.out.println("Total Marks : "+temp1.studentDetails.totalMarks);
                        System.out.println();
                    }
                    temp1=temp1.next;
                  }
                  if(flag1==0)
                  {
                    System.out.println("Student not found.");
                  }
                        break;  

                case 5:      // To update student's marks
                        System.out.println("Enter the ID of student you want to update marks for :");
                        int updateId=scanner.nextInt();

                        StudentNode temp2=student.first;
                        int flag2=0;
                        while (temp2!=null)
                     {
                         if(temp2.studentDetails.studentId==updateId)
                          {
                            flag2=1;
                            //Asking user which test's marks user want to update
                            System.out.println("Enter the TEST NO. i.e (1,2,3,4) whose marks you want to update :");
                            int testChoice=scanner.nextInt();
                            System.out.println();
                            
                            if(testChoice>=1 && testChoice <=4)
                            {
                                System.out.println("Enter new marks for Test "+testChoice+":");
                                double newMarks=scanner.nextDouble();

                                switch (testChoice) {
                                    case 1:
                                        temp2.studentDetails.t1_Marks=newMarks;
                                        break;
                                        case 2:
                                        temp2.studentDetails.t2_Marks=newMarks;
                                        break;
                                        case 3:
                                        temp2.studentDetails.t3_Marks=newMarks;
                                        break;
                                        case 4:
                                        temp2.studentDetails.t4_Marks=newMarks;
                                        break;
                                    default:
                                    System.out.println("Invalid test choice!");
                                        break;
                                }
                                temp2.studentDetails.totalMarks=temp2.studentDetails.t1_Marks+temp2.studentDetails.t2_Marks+temp2.studentDetails.t3_Marks+temp2.studentDetails.t4_Marks;

                            }
                            
                          }
                        temp2=temp2.next;
                       }
                      if(flag2==0)
                     {
                       System.out.println("Student not found.");
                    }
                        break;
                        
                case 6: //displaying student according tothier total marks.
                StudentNode calRank=student.first;
                while(calRank!=null)
                {
                    double totalMarks=calRank.studentDetails.t1_Marks+calRank.studentDetails.t2_Marks+calRank.studentDetails.t3_Marks+calRank.studentDetails.t4_Marks;
                    calRank.studentDetails.totalMarks=totalMarks;
                    calRank=calRank.next;
                }
                student.sortStudentsByTotalMarks();
                for (calRank = student.first; calRank != null; calRank = calRank.next) {
                    System.out.println("ID :"+calRank.studentDetails.studentId + "\t" +" NAME : "+
                                       calRank.studentDetails.name + "\t" + " Total Marks: "+
                                       calRank.studentDetails.totalMarks);
                }
                break;

                case 7:  //to display all the details of all the students.
                   student.display();
                break;

                case 0: //to exit.
                  System.exit(0);
                break;

                default:
                  System.out.println("Invalid input!");
                    break;
            }
        }

}
}

//To store all the data in the class object.
class StudentDetails
{
  int studentId;
  String name;
  Double t1_Marks;
  Double t2_Marks;
  Double t3_Marks;
  Double t4_Marks;
  Double totalMarks;
  StudentDetails next;
  StudentDetails prev;

  StudentDetails(int studentId,String name, Double t1_Marks,Double t2_Marks,Double t3_Marks,Double t4_Marks)
  {
    this.studentId=studentId;
    this.name=name;
    this.t1_Marks=t1_Marks;
    this.t2_Marks=t2_Marks;
    this.t3_Marks=t3_Marks;
    this.t4_Marks=t4_Marks;
    this.totalMarks = t1_Marks+t2_Marks+t3_Marks+t4_Marks;
    this.next=null;
    this.prev=null;
  }

}

//Creatig each student node.
class StudentNode
{
    // int data;
    StudentNode next;
    StudentNode prev;
    StudentDetails studentDetails;
    StudentNode(StudentDetails studentDetails)
    {
        this.studentDetails=studentDetails;
    }
    
}

//this class contains the logic of insert and delete
class StudentDoublyLinkedList
{
  StudentNode first;

  void insertStudentInOrder(StudentDetails studentDetails)
  {
    StudentNode node=new StudentNode(studentDetails);
    if(first==null)
    {
        first=node;
    }
    else if(first.studentDetails.studentId>node.studentDetails.studentId)
    {
        node.next=first;
        first.prev=node;
        first=node;
    }
    else
    {
        StudentNode temp=first;
        while(temp.next!=null && temp.next.studentDetails.studentId<node.studentDetails.studentId)
        {
            temp=temp.next;
        }
        node.next=temp.next;
        node.prev=temp;
        if(temp.next!=null)
        {
            temp.next.prev=node;
        }
       temp.next=node;
    }
   
  }

  void deleteStudent(int id)       //at particular id.
  {
    int flag=0;
    StudentNode p=first;
     while(p!=null)
     {
        if(p.studentDetails.studentId==id)
        {
            flag=1;
        }
        p=p.next;
     }
     if(flag==0)
     {
        System.out.println("The id you have entered doesn't exist! Please enter valid id.");
     }
     else
     {
        if(first.studentDetails.studentId==id && first.next==null)
        {
           first=null;
        }
        else if(first.studentDetails.studentId==id && first.next!=null)
        {
           first=first.next;
           first.prev=null;
        
        }
        else
        {
            StudentNode temp=first;
            while(temp.next.studentDetails.studentId!=id)
            {
                temp=temp.next;
            }
            if(temp.next.next==null)
            {
                temp.next.prev=null;
                temp.next=null;
            }
            else
            {
                StudentNode r=temp.next;
                r.next.prev=temp;
                temp.next=r.next;
                r.next=null;
                r.prev=null;
            }
        }
     }
  }

  //to get rank
  public void sortStudentsByTotalMarks() {
    boolean swapped;
    StudentNode lastNode = null;

    if (first == null)
        return;

    do {
        swapped = false;
        StudentNode current = first;
        StudentNode nextNode = first.next;

        while (nextNode != lastNode) {
            if (current.studentDetails.totalMarks < nextNode.studentDetails.totalMarks) {
                // Swap the students by updating the pointers
                StudentNode temp = current;
                current = nextNode;
                nextNode = temp;
                swapped = true;
            }

            current = current.next;
            nextNode = nextNode.next;
        }
        lastNode = current;
    } while (swapped);
}


  
  void display()
  {
    if(first==null)
    {
      System.out.println("The Doubly Linked list is empty!");
    }
    else
    {
        StudentNode temp=first;
        // System.out.println("-----------------DETAILS OF ALL STUDENTS-----------------");
        while(temp!=null)
        {

            System.out.println("ID : "+temp.studentDetails.studentId);
            System.out.println("Name : "+temp.studentDetails.name);
            System.out.println("Test-1 Marks : "+temp.studentDetails.t1_Marks);
            System.out.println("Test-2 Marks : "+temp.studentDetails.t2_Marks);
            System.out.println("Test-3 Marks : "+temp.studentDetails.t3_Marks);
            System.out.println("Test-4 Marks : "+temp.studentDetails.t4_Marks);
            System.out.println("Total Marks : "+temp.studentDetails.totalMarks);
            System.out.println();
            temp=temp.next;
        }
        System.out.println();
    }
  }
}
