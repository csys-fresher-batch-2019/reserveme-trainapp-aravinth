package trainticket.searchingTrain;

public class findTrain {
		public int train_num;
		public String train_name;
		public int price;
		public String travelling_time;

		public findTrain(int train_num, String train_name, int price, String travelling_time) {
			super();
			this.train_num = train_num;
			this.train_name = train_name;
			this.price = price;
			this.travelling_time = travelling_time;
		}
		
		public findTrain() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "findTrain [train_num=" + train_num + ", train_name=" + train_name + ", price=" + price
					+ ", travelling_time=" + travelling_time + "]";
		}

	}
