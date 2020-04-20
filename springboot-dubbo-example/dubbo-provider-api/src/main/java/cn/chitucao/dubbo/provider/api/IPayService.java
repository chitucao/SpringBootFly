package cn.chitucao.dubbo.provider.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/pay")
public interface IPayService {


    //暴露出去的服务
    //完成支付的功能
    @GET
    @Path("/{info}")
    String pay(@PathParam("info") String info);
}
