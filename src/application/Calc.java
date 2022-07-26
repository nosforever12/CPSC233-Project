package application;

public class Calc {
	static String solveValues(double h, double o, double a, double t, boolean d){
		String formula = "";
		String angleMode = d ? "(Degrees)" : "(Radians)";
		
		if(h!=0 && o!=0) {
			t = Math.asin(o/h);
			formula += "θ = aSin(o/h)";
			formula += "\nRearranged from: sinθ = o/h";
			a = Math.sqrt(h*h - o*o);
		} else if(h!=0 && a!=0) {
			t = Math.acos(a/h);
			formula += "θ = aCos(a/h)";
			formula += "\nRearranged from: cosθ = a/h";
			o = Math.sqrt(h*h - a*a);
		} else if(h!=0 && t!=0) {
			o = h*Math.sin(t);
			formula += "o = h*sin(θ)";
			formula += "\nRearranged from: sinθ = o/h";
			a = h*Math.cos(a);
			formula += "a = h*cos(θ)";
			formula += "\nRearranged from: cosθ = a/h";
		} else if(o!=0 && a!=0) {
			t = Math.atan(o/a);
			formula += "θ = aTan(o/a)";
			formula += "\nRearranged from: tanθ = o/a";
			h = Math.sqrt(a*a + o*o);
		} else if(o!=0 && t!=0) {
			h = o/Math.sin(t);
			formula += "h = o/sin(θ)";
			formula += "\nRearranged from: sinθ = o/h";
			a = o/Math.tan(t);
			formula += "a = o/tan(θ)";
			formula += "\nRearranged from: tanθ = o/a";
		} else if(a!=0 && t!=0) {
			o = a*Math.tan(t);
			formula += "o = a*tan(θ)";
			formula += "\nRearranged from: tanθ = o/a";
			h = Math.sqrt(a*a + o*o);
		}
		if(d) t = Math.toDegrees(t);
		
		return  "H:" + h + " O:" + o + " A:" + a + " θ:" + t + angleMode + "\nFormula Used: " + formula;
	}
	
}
