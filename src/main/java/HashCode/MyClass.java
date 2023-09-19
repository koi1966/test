package HashCode;

public class MyClass {
private Long id;
private String name;

    public MyClass(Long id, String name) {
        this.setId(id);
        this.setName(name);
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
//        Throwable
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return getId().equals(myClass.getId()) && getName().equals(myClass.getName());
    }

    public int hashCode(){
        System.out.println("HashCode is callc: " + this);
        return getId().intValue();
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
