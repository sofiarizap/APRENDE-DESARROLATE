const{createApp} = Vue; 

createApp({
  data(){
    return{
      url:"",
      id: "",
      urlParameter:"",
      parameter : undefined,
      producto:"",
    }
  },
  created(){
    this.urlParameter = location.search
    this.parameter = new URLSearchParams(this.urlParameter)
    this.id = this.parameter.get("id")
    this.loadData()
  },
  mounted() {
    window.addEventListener('mousemove', this.handleMouseMove);
  },
  beforeUnmount() {
    window.removeEventListener('mousemove', this.handleMouseMove);
  },
  methods:{
    loadData: function(){
      this.url =`/api/productos/${this.id}`
      axios.get(this.url)
      .then( res =>{
        this.producto= res.data
      })
      .catch((error)=>{console.log(error)})
  },
  handleMouseMove() {
    let animacion = this.$refs.animacion;
    let posicionobj1 = animacion.getBoundingClientRect().top;
    let tamañoDePantalla = window.innerHeight;
    if (posicionobj1 <= tamañoDePantalla) {
      animacion.style.animation = 'mover 2s ease-out';
    }
  },

}
}).mount("#app")
