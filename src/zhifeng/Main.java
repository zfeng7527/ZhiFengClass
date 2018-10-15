package zhifeng;

public class Main {
    public class Person
    {
        private String name;
        private String cell;
        public Person(String theName,String theCell){
            this.name=theName;
            this.cell=theCell;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String theName){
            this.name = theName;
        }
        public String cell(){
            return this.cell;
        }
        public void setCell(String theCell)
        {
            this.cell=theCell;
        }
        public String toString(){
            return "name" + this.name + ", cell: " + this.cell;
        }

    }
    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person("Deja", "555 132-3253");
        System.out.println(p1);
        Person p2 = new Person("Avery", "555 132-6632");
        System.out.println(p2);
    }
}
