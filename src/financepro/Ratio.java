/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financepro;

/**
 *
 * @author Anshuman
 */
public class Ratio extends RatioObj {
	
        
	public double CurrAsset;		//Assets
	public double Liabilities;		
	public double Inventory;
	public double Cash;
	public double Revenue;
	public double AccRec;			//Accounts received
	public double RevPerDay;		
	public double CostGPD;			//Cost of goods per day
	public double InventoryAvg;			//Inventory Average
	public double NetIncome;
	public double GrossProfit;
	public double OpCost;	
	
	
                public Ratio()
                {
                        CurrAsset = -1;
                        Liabilities = -1;
                        Inventory  = -1;
                        Cash = -1;
                        Revenue = -1;
                        AccRec = -1;
                        RevPerDay = -1;
                        CostGPD = -1;
                        InventoryAvg = -1;
                        NetIncome = -1;
                        GrossProfit = -1;
                        OpCost = -1;
                }
                
//                public Ratio(Ratio passedObj)
//                {
//                        CurrAsset = passedObj.CurrAsset ;
//                        Liabilities = passedObj.Liabilities;
//                        Inventory  = passedObj.Inventory;
//                        Cash = passedObj.Cash;
//                        Revenue = passedObj.Revenue;
//                        AccRec = passedObj.AccRec;
//                        RevPerDay = passedObj.RevPerDay;
//                        CostGPD = passedObj.CostGPD;
//                        InventoryAvg = passedObj.InventoryAvg;
//                        NetIncome = passedObj.NetIncome;
//                        GrossProfit = passedObj.GrossProfit;
//                        OpCost = passedObj.OpCost;
//                }
        
	public void Equity()
	{
                Equity = CurrAsset - Liabilities;
                System.out.println(Equity);
	}
	

	public void CurrRatio()
	{
		CurrRatio = CurrAsset / Liabilities;
	}
	
	public void QuickRatio()
	{
		double QuickRatio = ( CurrAsset - Inventory ) / Liabilities;
	}
	
	public void CashRatio()
	{
		CashRatio = Cash / Liabilities;
	}
	
	//
	public void AssetsTo()
                {
		AssetsTo = Revenue / CurrAsset;
	}
	
	public void DaysSalesOut()
                {
		DaySalesOut = AccRec / RevPerDay;
	}
	
	public void DaysPayOut()
                {
		DaysPayOut = AccRec / CostGPD;
	}
	
	public void InvDays()
                {
		InvDays= InventoryAvg / CostGPD;
	}

	public void ReturnOnSales() 
                {
		ReturnOnSales = NetIncome / Revenue;
	}

                public void ReturnOnAssets()
                {
		ReturnOnAssets = NetIncome/ CurrAsset;
	}

	public void ReturnOnEquity()
                {
		ReturnOnEquity = NetIncome / Equity;
	}

	public void GrossProfitMargin()
                {
		GrossProfitMargin = GrossProfit / Revenue;
	}

	public void EBIT()
                {
		EBIT = ( GrossProfit - OpCost ) / Revenue;
	}
}