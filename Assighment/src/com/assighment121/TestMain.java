package com.assighment121;

public class TestMain {
	public static void main(String[] args) {
		ICICIBank iCICIBank = new ICICIBank();
		iCICIBank.getICICIbankDetails();
		SBIBank sBIBank=new SBIBank();
		sBIBank.getSBIBankDetails();
		HDFCBank hDFCBank=new HDFCBank();
		hDFCBank.getHDFCBankDetails();
		
	}
}
