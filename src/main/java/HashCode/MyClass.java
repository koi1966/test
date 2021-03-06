package HashCode;

public class MyClass {
private Long id;
private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
//    @Override
//    public boolean equals(Object obj){
//        System.out.println("Equalse is callc: " + this + ": " + obj);
//        MyClass other = (MyClass) obj;
//        return id.equals(other.id) && name.equals(other.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return id.equals(myClass.id) && name.equals(myClass.name);
    }

    public int hashCode(){
        System.out.println("HashCode is callc: " + this);
        return id.intValue();
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
