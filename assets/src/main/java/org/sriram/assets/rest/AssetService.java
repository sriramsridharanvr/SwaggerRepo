package org.sriram.assets.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.sriram.assets.RestServiceResponse;
import org.sriram.assets.asset.Asset;
import org.sriram.assets.asset.AssetHandler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/assets")
@Api(value="Assets")
public class AssetService {
	
	private AssetHandler service = new AssetHandler();
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="Fetches all available assets", produces="application/json")
	public Response fetchClients() {
		List<Asset> assets = this.service.getAllAssets();
		return RestServiceResponse.create(Status.OK, assets.size() + " assets found", assets);
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	@ApiOperation(value="Fetches information about a single asset", produces="application/json", responseReference="RestServiceResponse<Asset>")
	public Response fetchAssetDetail(@PathParam("id") int id) {
		Asset asset = this.service.getAsset(id);
		return RestServiceResponse.create(Status.OK, "Asset details fetched!", asset);
	}
	
	/*@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAsset(Asset asset) {
		this.service.createAsset(asset);
		return RestServiceResponse.create(Status.CREATED, "Asset added successfully", asset);
	}*/
	
	
}		
