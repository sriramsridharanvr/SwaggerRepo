package org.sriram.assets.asset;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AssetHandler {
	public List<Asset> getAllAssets() {
		List<Asset> assets = new ArrayList<Asset>();
		for(int i=0; i<10; i++) {
			assets.add(Asset.create("Asset" + i, "Laptop", "Ram"));
		}
		
		return assets;
	}
	
	public Asset getAsset(int id) {
		Asset asset = Asset.create("Dell Latitude 3450", "Laptop", "Ram");
		asset.setId(id);
		return asset;
	}
	
	public void createAsset(Asset asset) {
		asset.setId(new Random().nextInt(9999));
	}
}
