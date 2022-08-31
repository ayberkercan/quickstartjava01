//public class Employee {

    //attribute // field
  //  private int id ;
  //  private String name ;
  //  private String email ;
    //setter getter


   // public int getId() {

    //    return id;
 //   }

  //  public void setId(int id) {
  //      if (id >100) {
      //      this.id=100;
   //     }
     //   else {
      //      this.id=id;
      //  }
  //  }

 //   public String getEmail() {
    //    return email;
  //  }

  //  public String getName() {
      //  return name;
   // }

    // Constructor
   // public Employee(int id , String name , String email){

  //  }
//public void showInfos(){
  //  System.out.println("name : "+this.name);
 //   System.out.println("id :" +this.id);
 //   System.out.println("email :"+ this.email);
//}
//}

//Subclass , childclass , derived class
public class Employee extends person{
    private int id ;
    private int salary ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee (int id ,String name , int salary){
        super(name);
        this.id=id;
        this.salary=salary;
    }
}
