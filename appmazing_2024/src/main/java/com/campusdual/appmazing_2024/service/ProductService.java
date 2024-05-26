package com.campusdual.appmazing_2024.service;

import java.util.List;

import com.campusdual.appmazing_2024.api.IProductService;
import com.campusdual.appmazing_2024.model.Product;
import com.campusdual.appmazing_2024.model.dto.ProductDTO;
import com.campusdual.appmazing_2024.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.campusdual.appmazing_2024.model.dao.ProductDao;

@Service("ProductService")
@Lazy
public class ProductService implements IProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductDTO queryProduct(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        return ProductMapper.INSTANCE.toDTO(productDao.getReferenceById(product.getId()));
// Esta es la forma extendida del mismo return
//        int id = product.getId(); //el id del producto del que queremos info
//        Product productoEntidad = productDao.getReferenceById(id);
//        ProductDTO productPojo = ProductMapper.INSTANCE.toDTO(productoEntidad);
//        return productPojo;
    }

    @Override
    public List<ProductDTO> queryAllProducts() {
        //Esta es la forma extendida
//        List<Product> listaEntidadesProducto = productDao.findAll();
//        List<ProductDTO> listaPojosProducto = ProductMapper.INSTANCE.toDTOList(listaEntidadesProducto);
//        return listaPojosProducto;
        return ProductMapper.INSTANCE.toDTOList(productDao.findAll());
    }

    @Override
    public int insertProduct(ProductDTO productDTO) {
        //Esta es la forma ectendida
//        Product entidadProducto = ProductMapper.INSTANCE.toEntity(productDTO);//Entidad sin ID
//        productDao.saveAndFlush(entidadProducto);//al insertar en DB se genra un nuevo ude para ese registro nuevo
//        //eL Flush recupera el id generado y se lo añade a la entidad
//        int idDeLaEntidad = entidadProducto.getId();
//        return idDeLaEntidad;
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        productDao.saveAndFlush(product);//saveAndFlush inserta si no existe y actualiza si ya existe

        return product.getId();
    }

    @Override
    public int updateProduct(ProductDTO productDTO) {
        //seria aconsejable un is else para evaluar que no haya no intentar actualizar sin enviar un id
        return insertProduct(productDTO);//saveAndFlush inserta si no existe y actualiza si ya existe con un id
    }

    @Override
    public int deleteProduct(ProductDTO productDTO) {
        int id = productDTO.getId();
        productDao.delete(ProductMapper.INSTANCE.toEntity(productDTO));
        return id;
    }
}