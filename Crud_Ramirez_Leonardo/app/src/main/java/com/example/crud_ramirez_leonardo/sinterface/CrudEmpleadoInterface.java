package com.example.crud_ramirez_leonardo.sinterface;
import com.example.crud_ramirez_leonardo.model.Empleado;
import java.util.List;
import  retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CrudEmpleadoInterface {
    @GET("/consultarAll")
    Call<List<Empleado>> getAll();

    @POST("/guardar")
    Call<List<Empleado>> createEmpleado();

    @GET("/consultar/{id}")
    Call<List<Empleado>> findbyId(int id);



}
