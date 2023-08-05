import java.util.*;
class StudentManagementSystem
 {
     HashMap<Double,String> set3=new HashMap<Double,String>();
     public StudentManagementSystem()
     {
     for(double i=90;i<=100;i++)
     {
       set3.put(i,"Grade S");
     }
     for(double j=80;j<90;j++)
     {
       set3.put(j,"Grade A");
     }
     for(double k=70;k<80;k++)
     {
       set3.put(k,"Grade B");
     }
     for(double l=60;l<70;l++)
     {
       set3.put(l,"Grade C");
     }
     for(double m=50;m<60;m++)
     {
       set3.put(m,"Grade D");
     }
     for(double n=40;n<50;n++)
     {
       set3.put(n,"Grade E");
     }
     for(double p=0;p<40;p++)
     {
       set3.put(p,"Grade F");
     }
     }
      Scanner so=new Scanner(System.in);
      HashMap<String,Double> set=new HashMap<String,Double>();
      HashMap<String,String> set7=new HashMap<String,String>();
      HashSet<String> p1=new HashSet(); 
      HashSet<Double> p2=new HashSet();
        void add()
        {
        System.out.println("Enter number of students to be added:");
        int n=so.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("Add Student Name, Roll Number, and Marks:");
        String str=so.next() + so.nextLine();
        String srt=so.next() + so.nextLine();
        double m=so.nextDouble();
        set.put(str,m);
        set7.put(str,srt);
        }
        }
         void remove()
         {
            System.out.println("Enter student to be removed:");
            String str1=so.next() + so.nextLine();
            set.remove(str1);
            set7.remove(str1);
         }
         void modify()
         {
            System.out.println("Enter 1 to modify Student Name");
            System.out.println("Enter 2 to modify Student Roll Number");
            System.out.println("Enter 3 to modify Student Mark");
            System.out.println("Enter choice:");
            int ch=so.nextInt();
            if(ch==1)
            {
              System.out.println("Enter the Student Name to Modify:"); 
              String stt=so.next() + so.nextLine();
              double ms=set.remove(stt); 
              String reg=set7.remove(stt);
              System.out.println("Enter the Name to be Updated:");
              String stt2=so.next() + so.nextLine();
              set.put(stt2,ms);
              set7.put(stt2,reg);
            }
            else if(ch==2)
            {
              System.out.println("Enter the Student Name to Modify:"); 
              String stt6=so.next() + so.nextLine();
              System.out.println("Enter the Roll Number to be Updated:");
              String ms3=so.next() + so.nextLine();
              set7.put(stt6,ms3);
            }
         
            else if(ch==3)
            {
              System.out.println("Enter the Student Name to Modify:"); 
              String stt4=so.next() + so.nextLine();
              System.out.println("Enter the Mark to be Updated:");
              double ms1=so.nextDouble();
              set.put(stt4,ms1);
            }
         }
         void search()
         {
             System.out.println("Enter Student Name:");
             String stt5=so.next() + so.nextLine();
             ArrayList<Double> sort = new ArrayList<Double>(set.values());
              for(int i=0;i<sort.size();i++)
          {
          for(int j=i+1;j<sort.size();j++)
           {
              if(sort.get(i)<sort.get(j))
              {
                  double p=sort.get(j);
                  sort.set(j,sort.get(i));
                  sort.set(i,p);
              }
           }
           }
           double yt=set.get(stt5);
           int rn=sort.indexOf(yt)+1;
             System.out.println("Rank: " + rn +  " Student Marks: " + yt + " Student Name: " + stt5 + " Roll Number: " + set7.get(stt5) + " Result: " +set3.get(yt));
         }
         void display()
         {
          ArrayList<Double> sort = new ArrayList<Double>(set.values());
          if (sort.isEmpty()==true)
          {
              System.out.println("No Records Found");
          }
          else
          {
          for(int i=0;i<sort.size();i++)
          {
          for(int j=i+1;j<sort.size();j++)
           {
              if(sort.get(i)<sort.get(j))
              {
                  double p=sort.get(j);
                  sort.set(j,sort.get(i));
                  sort.set(i,p);
              }
           }
           }
           int w=0;
           Iterator<Double> itr = sort.iterator();
           while(itr.hasNext())
           {
           double key = itr.next();
           Iterator<Map.Entry<String,Double>> iter = set.entrySet().iterator();
           while (iter.hasNext()) 
           {
           Map.Entry<String,Double> entry = iter.next();
           if (entry.getValue()==key && p1.contains(entry.getKey())==false && p2.contains(entry.getValue())==false) 
           {
             w=w+1;
             System.out.println("Rank: " + w +  " Student Marks: " + key + " Student Name: " + entry.getKey() + " Roll Number: " + set7.get(entry.getKey()) + " Result: " +set3.get(key));
             p1.add(entry.getKey());
             p2.add(entry.getValue());
           }
           else if (entry.getValue()==key && p1.contains(entry.getKey())==false && p2.contains(entry.getValue())==true)
           {
            p1.add(entry.getKey());
            System.out.println("Rank: " + w +  " Student Marks: " + key + " Student Name: " + entry.getKey() + " Roll Number: " + set7.get(entry.getKey()) + " Result: " +set3.get(key));
           }
          }
          }
          }
      p1.clear();
      p2.clear();
         }
 }
public class Main
 {
   public static void main(String args[])
   { 
       Scanner so=new Scanner(System.in);
     StudentManagementSystem obj=new StudentManagementSystem();
      System.out.println("1. Add Student Name, Roll Number, and Mark");
      System.out.println("2. Remove Details");
      System.out.println("3. Modify Details");
      System.out.println("4. Search a Student");
      System.out.println("5. Display Details");
      System.out.println("6. Exit");
      System.out.println("Enter choice to proceed:");
      int chh=so.nextInt();
      if(chh<1 || chh>6)
      {
          System.out.println("Invalid Choice. Please enter a choice again:");
          chh=so.nextInt();
      }
      while(chh>=1 && chh<=5)
      {
      if(chh==1)
      { 
     obj.add();
      }
     else if(chh==2)
      {
     obj.remove();
      }
      else if(chh==3)
      {
     obj.modify();
      }
      else if(chh==4)
      {
     obj.search();
      }
      else if(chh==5)
      {
     obj.display();
      }
      System.out.println("Enter choice to proceed further:");
      System.out.println("1. Add Student Name, Roll Number, and Mark");
      System.out.println("2. Remove Details");
      System.out.println("3. Modify Details");
      System.out.println("4. Search a Student");
      System.out.println("5. Display Details");
      System.out.println("6. Exit");
      chh=so.nextInt();
      if(chh<1 || chh>6)
      {
          System.out.println("Invalid Choice. Please enter a choice again:");
          chh=so.nextInt();
      }
      }
    System.out.println("Process Finished");
   }
 }