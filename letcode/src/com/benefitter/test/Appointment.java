package com.benefitter.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * brunolima on Jul 1, 2021
 * 
 */

public class Appointment {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String npnS = sc.nextLine();
		List<Producer> result = new ArrayList<Producer>();

		try {
			BufferedReader bf = new BufferedReader(new FileReader("appointment_list_sample.csv"));
			String line;
			Producer producer = null;

			while ((line = bf.readLine()) != null) {
				if (line.contains("Producer_ID")) {
					continue;
				}

				String[] values = line.split(";");
				System.out.println(Arrays.toString(values));

				producer = new Producer(Integer.parseInt(values[0].split(",")[0]),
						Integer.parseInt(values[0].split(",")[1]), Integer.parseInt(values[0].split(",")[2]),
						values[0].split(",")[3], values[0].split(",")[4]);

				if (producer.getNpn().equals(Integer.valueOf(npnS))) {
					result.add(producer);
				}
			}

			bf.close();
			sc.close();
		} catch (Exception e) {
//			System.out.println(result);
			System.err.println("Error >>>" + e.getMessage() + "\n");
		} finally {
			System.out.println(result.get(result.size() - 1));
		}
	}
}

class Producer {

	private Integer id;
	private Integer npn;
	private Integer taxId;
	private String producerRole;
	private String appointmentState;

	public Producer(Integer id, Integer npn, Integer taxId, String producerRole, String appointmentState) {
		super();
		this.id = id;
		this.npn = npn;
		this.taxId = taxId;
		this.producerRole = producerRole;
		this.appointmentState = appointmentState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNpn() {
		return npn;
	}

	public void setNpn(Integer npn) {
		this.npn = npn;
	}

	public Integer getTaxId() {
		return taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}

	public String getProducerRole() {
		return producerRole;
	}

	public void setProducerRole(String producerRole) {
		this.producerRole = producerRole;
	}

	public String getAppointmentState() {
		return appointmentState;
	}

	public void setAppointmentState(String appointmentState) {
		this.appointmentState = appointmentState;
	}

	@Override
	public String toString() {
		return "Producer [id=" + id + ", npn=" + npn + ", taxId=" + taxId + ", producerRole=" + producerRole
				+ ", appointmentState=" + appointmentState + "]";
	}

}
