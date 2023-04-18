package com.example.crud_ramirez_leonardo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.crud_ramirez_leonardo.model.Empleado;
import com.example.crud_ramirez_leonardo.sinterface.CrudEmpleadoInterface;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAll();
        CreateEmpleado();
        findbyId(int id);
    }
    private void getAll(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.30.192.1:8082")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CrudEmpleadoInterface cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call =cruempleado.getAll();
        call.enqueue((new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(response.isSuccessful()){
                    // System.out.println(response.message());
                    Log.i("Response err:,",response.message());
                    return;
                }

                //listEmpleado.forEach(p-> System.out.println((p.toString())));
                List listEmpleado = response.body();
                listEmpleado.forEach(p-> Log.i("Empleados: ",p.toString()));
            }


            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                // System.out.println(t.getMessage());
                Log.e("Throw error:",t.getMessage());
            }
        }));
    }

    private void CreateEmpleado(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.30.192.1:8082")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CrudEmpleadoInterface cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call =cruempleado.createEmpleado();
        call.enqueue((new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(response.isSuccessful()){
                    // System.out.println(response.message());
                    Log.i("Response err:,",response.message());
                    return;
                }

                //listEmpleado.forEach(p-> System.out.println((p.toString())));
                List listEmpleado = response.body();
                listEmpleado.forEach(p-> Log.i("Empleados: ",p.toString()));
            }


            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                // System.out.println(t.getMessage());
                Log.e("Throw error:",t.getMessage());
            }
        }));
    }

    private void findbyId(int id){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.30.192.1:8082")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CrudEmpleadoInterface cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call =cruempleado.findbyId(id);
        call.enqueue((new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(response.isSuccessful()){
                    // System.out.println(response.message());
                    Log.i("Response err:,",response.message());
                    return;
                }

                //listEmpleado.forEach(p-> System.out.println((p.toString())));
                List listEmpleado = response.body();
                listEmpleado.forEach(p-> Log.i("Empleados: ",p.toString()));
            }


            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                // System.out.println(t.getMessage());
                Log.e("Throw error:",t.getMessage());
            }
        }));
    }
}