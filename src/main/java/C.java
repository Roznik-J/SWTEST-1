package pset1;

public class C {
    int f;

    public C(int f) {
        this.f = f;
    }

    @Override
    public boolean equals(Object o) {
        // assume this method is implemented for you
	if(this == o){ return true;}
        if(!super.equals(o)){return false;}
        if(getClass() != o.getClass()){return false;}
        C Cobj = (C) o;
        if( f != Cobj.f){return false;}
	return true;
    }

    @Override
    public int hashCode() {
        // assume this method is implemented for you
	return 1;
    }
}
