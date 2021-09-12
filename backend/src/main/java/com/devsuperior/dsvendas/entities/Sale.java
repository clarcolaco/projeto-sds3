package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

public class Sale {

	
		private Long id;
		private Integer visited;
		private Integer deals;
		private Integer amount;
		private LocalDate date;
		
		private Seller seller;
		
		public Sale() {
			
		}

		public Sale(Long id, Integer visited, Integer deals, Integer amount, LocalDate date, Seller seller) {
			
			this.id = id;
			this.visited = visited;
			this.deals = deals;
			this.amount = amount;
			this.date = date;
			this.seller = seller;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getVisited() {
			return visited;
		}

		public void setVisited(Integer visited) {
			this.visited = visited;
		}

		public Integer getDeals() {
			return deals;
		}

		public void setDeals(Integer deals) {
			this.deals = deals;
		}

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public Seller getSeller() {
			return seller;
		}

		public void setSeller(Seller seller) {
			this.seller = seller;
		}
		
		
		
		
		
}
