package atos;

public class Exercice1Cercle {
	
	
	private double rayon;

    public Exercice1Cercle() {
        super();
    }

    public Exercice1Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double airCercle(){
        return Math.PI * Math.pow(rayon,2);
    }

    public double perimetreCercle(){
        return Math.PI * 2 * rayon;
    }

	public static void main(String[] args) {
		
		Exercice1Cercle cercle1 = new Exercice1Cercle(5);
        System.out.println("L'aire du cercle est: " + cercle1.airCercle());
        System.out.println("\nLe perimetre du cercle est: " + cercle1.perimetreCercle());


	}

}
