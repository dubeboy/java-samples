package GenerateSamples;

/**
 * Created by aganezov on 10/17/15.
 * JetBrains GWU
 */
public class Dummy {
    private int field1;
    private int field2;
    private String field3;

    /* Automatically generated by   Cmd + N -> toString()           */
    @Override
    public String toString() {
        return "Dummy{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                ", field3='" + field3 + '\'' +
                '}';
    }

    /* Automatically generated by    Cmd + N -> equals() and hashCode()      */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dummy)) return false;

        Dummy dummy = (Dummy) o;

        if (field1 != dummy.field1) return false;
        if (field2 != dummy.field2) return false;
        return !(field3 != null ? !field3.equals(dummy.field3) : dummy.field3 != null);

    }

    /* Automatically generated by    Cmd + N -> equals() and hashCode()      */
    @Override
    public int hashCode() {
        int result = field1;
        result = 31 * result + field2;
        result = 31 * result + (field3 != null ? field3.hashCode() : 0);
        return result;
    }

    /* Automatically generated by    Cmd + N -> Constructor      */
    public Dummy(int field1, int field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
}