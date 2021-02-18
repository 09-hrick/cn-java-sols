
public class ComplexNumbers {
    private int rel;
	private int img;
	
	public ComplexNumbers(int rel,int img) {
		this.rel=rel;
		this.img=img;
	}
	
	public int getimg() {
		return img;
	}
	
	public int getrel() {
		return rel;
	}
	
	public void setimg(int img) {
		this.img = img;
	}
	
	public void setrel(int rel) {
		this.rel = rel;
	}
	
	public void plus(ComplexNumbers c) {
		int rel=this.rel + c.rel;
		int img=this.img+c.img;
		this.rel=rel;
		this.img=img;
	}
	public void multiply(ComplexNumbers c) {
		int rel= this.rel * c.rel - this.img * c.img;
		int img= this.rel * c.img + c.rel * this.img;
		this.rel=rel;
		this.img=img;
	}
	public static ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c2) {
		int rel=c1.rel + c2.rel;
		int img=c1.img+c2.img;
		return new ComplexNumbers(rel, img);
	}
	public static ComplexNumbers multiply(ComplexNumbers c1,ComplexNumbers c2) {
		int rel= c1.rel * c2.rel - c1.img * c2.img;
		int img= c1.rel * c2.img + c2.rel * c1.img;
		return new ComplexNumbers(rel, img);
	}
	public void print() {
		System.out.println(this.rel + " + i"+ this.img);
	}
	public ComplexNumbers conjugate() {
		int img=-this.img;
		return new ComplexNumbers(this.rel, img);
	}
	
}