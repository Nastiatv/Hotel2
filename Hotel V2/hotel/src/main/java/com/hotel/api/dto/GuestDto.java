package com.hotel.api.dto;

import com.hotel.entity.Guest;

public class GuestDto {

	
	public GuestDto() {}
	
		private int id;

		public Guest(int id) {
			this.id = id;
		}
		public Guest(Guest guest) {
			this.id = guest.getId();
		}

		public Guest() {
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Guest Id: ");
			sb.append(id);
			String guestToString=sb.toString();
			logger.info(guestToString);
			return sb.toString();
		}
	}


}
