package cf.rodolfo.JavaCore.K_Enum.domain;

public enum PaymentType {
	DEBIT {
		@Override
		public double calculateDiscount(double value) {
			return value * 0.1;
		}
	},
	CREDIT {
		@Override
		public double calculateDiscount(double value) {
			return value * 0.05;
		}

	};

	public double calculateDiscount(double value) {
		return 0;

	}
}