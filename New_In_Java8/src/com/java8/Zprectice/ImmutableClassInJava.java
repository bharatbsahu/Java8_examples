package com.java8.Zprectice;

import java.util.Objects;

public final class ImmutableClassInJava {
	
	private final String currency; // e.g., "INR"
	private final long paise;      // store smallest unit for precision
	
	public ImmutableClassInJava(String currency, long paise) {
		
		if(null == currency || currency.isEmpty()) {
			throw new IllegalArgumentException("currency must be non-blank");
		}
		
        this.currency = currency;
        this.paise = paise;
	}

	public String getCurrency() {
		return currency;
	}

	public long getPaise() {
		return paise;
	}
	
	// No setters; provide "withers" to create modified copies
	public ImmutableClassInJava add(long paiseToAdd) {
		
		return new ImmutableClassInJava(this.currency, this.paise + paiseToAdd);
	}
	
	public ImmutableClassInJava withCurrency(String newCurrency) {
		
		return new ImmutableClassInJava(newCurrency, this.paise );
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, paise);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableClassInJava other = (ImmutableClassInJava) obj;
		return Objects.equals(currency, other.currency) && paise == other.paise;
	}

	@Override
	public String toString() {
		return "ImmutableClassInJava [currency=" + currency + ", paise=" + paise + "]";
	}
	
	public static void main(String[] args) {
		
		ImmutableClassInJava obj = new ImmutableClassInJava("23", 2);
				
		System.out.println("********************* ImmutableClassInJava: obj"+obj.toString());
		
		ImmutableClassInJava obj1 = obj.add(4);
		
		System.out.println("********************* ImmutableClassInJava: obj1"+obj1.toString());
		
	}

}
