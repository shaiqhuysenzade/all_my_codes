package warmup.hackerank;

import atHome.method.Ex;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Example {
    private int id;
    private String name;
    private String address;

    // Setter Methods
    // Note that all setters method
    // return this reference


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return id == example.id &&
                Objects.equals(name, example.name) &&
                Objects.equals(address, example.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, address);
    }

    public Example setId(int id)
    {
        this.id = id;
        return this;
    }

    public  Example setName(String name)
    {
        this.name = name;
        return this;
    }

    public Example setAddress(String address)
    {
        this.address = address;
        return this;
    }

    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address;
    }
}