package pset1;

public class D extends C{
    int g;

    public D(int f, int g) {
        super(f);
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        // assume this method is implemented for you
	
	// TODO: Temporary return
	if(this == o){ return true;}
	if(!super.equals(o)){return false;}
	if(getClass() != o.getClass()){return false;}
	D Dobj = (D) o;
	if( g != Dobj.g){return false;}
	return true;
    }

    @Override
    public int hashCode() {
        // assume this method is implemented for you
	
	//TODO: Tempporary return
	return 1;
    }
}
