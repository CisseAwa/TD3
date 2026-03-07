package sn.awacisse.l2gl.app.model;

import java.util.Objects;

public final class Duo<A,B> {
    private final A a;
    private final B b;

    public Duo(A a, B b) {
        if(a==null && b==null){
            throw new IllegalArgumentException("Ne doit pas être null!");
        }
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Duo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Duo<?, ?> duo = (Duo<?, ?>) o;
        return Objects.equals(a, duo.a) && Objects.equals(b, duo.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
