/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PedidosDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public int GuardarVentas(Pedidos v){       
        String sql="insert into pedidos(id_cliente,ci_repartidor,fecha,total)values(?,?,?,?)";
        try {
            con=cn.conectarPG();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getCi_idRepartidor());
            ps.setString(3,v.getFecha());
            ps.setDouble(4, v.getTotal());
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        
        return r;
    }
    public int GuardarDetalleVentas(DetallePedido dv){
        String sql="insert into detallePedido(id_pedido,id_producto,cantidad,precioUnitario)values(?,?,?,?)";
        try {
            con=cn.conectarPG();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getIdPedido());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPreUnitario());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public String IdVentas(){
        String idv="";
        String sql="select max(numero) from pedidos";
        try {
            con=cn.conectarPG();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                idv=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idv;
    }
}
