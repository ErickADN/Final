package onpe.final2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Resumen {
	@Id
	
	private int Numerop1;
	private double TotalP1;
	private int NumeroP2;
	private double TotalP2;
	private int NumeroAsistentes;
	private double TotalAsistentes;
	private int NumeroAusentes;
	private double TotalAusentes;
	private int ElectoresHabiles;
	public int getNumerop1() {
		return Numerop1;
	}
	public void setNumerop1(int numerop1) {
		Numerop1 = numerop1;
	}
	public double getTotalP1() {
		return TotalP1;
	}
	public void setTotalP1(double totalP1) {
		TotalP1 = totalP1;
	}
	public int getNumeroP2() {
		return NumeroP2;
	}
	public void setNumeroP2(int numeroP2) {
		NumeroP2 = numeroP2;
	}
	public double getTotalP2() {
		return TotalP2;
	}
	public void setTotalP2(double totalP2) {
		TotalP2 = totalP2;
	}
	public int getNumeroAsistentes() {
		return NumeroAsistentes;
	}
	public void setNumeroAsistentes(int numeroAsistentes) {
		NumeroAsistentes = numeroAsistentes;
	}
	public double getTotalAsistentes() {
		return TotalAsistentes;
	}
	public void setTotalAsistentes(double totalAsistentes) {
		TotalAsistentes = totalAsistentes;
	}
	public int getNumeroAusentes() {
		return NumeroAusentes;
	}
	public void setNumeroAusentes(int numeroAusentes) {
		NumeroAusentes = numeroAusentes;
	}
	public double getTotalAusentes() {
		return TotalAusentes;
	}
	public void setTotalAusentes(double totalAusentes) {
		TotalAusentes = totalAusentes;
	}
	public int getElectoresHabiles() {
		return ElectoresHabiles;
	}
	public void setElectoresHabiles(int electoresHabiles) {
		ElectoresHabiles = electoresHabiles;
	}
	
	

}
