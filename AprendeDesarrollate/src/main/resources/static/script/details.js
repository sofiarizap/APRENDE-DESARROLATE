const {createApp} = Vue;

createApp({
  data(){
    return{
      url:"",
      productos:"",
      productosActivos:"",
      categorias: [],
      productosFiltrados: [],
      checked: [],
      inputBusqueda: "",
      
    }
  },
  created(){
    this.url = "/api/productos";
    this.loadData() 

    
  },  
  methods:{
    loadData: function(){
      axios.get(this.url)
      .then( res =>{
        this.productos= res.data;
        this.productosActivos= this.productos.filter(producto => producto.Activo == true)
        this.productosFiltrados = res.data.map(producto => ({ ...producto }));
        this.categorias = [... new Set(this.productos.map(producto => producto.categoria))];
        console.log(this.productos)
      })
      .catch((error)=>{console.log(error)})
    },
    busquedaCruzada: function () {
      let filtroInput = this.productos.filter(producto => producto.nombre.toLowerCase().includes(this.inputBusqueda.toLowerCase()))
      if (this.checked.length === 0) {
          this.productosFiltrados = filtroInput
      } else {
          let filtroCheck = filtroInput.filter(categoria => this.checked.includes(categoria.categoria))
          this.productosFiltrados = filtroCheck
      }
  },
    
  } 
}).mount("#app")