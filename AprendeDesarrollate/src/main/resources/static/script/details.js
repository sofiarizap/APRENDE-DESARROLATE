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
  methods:{
    loadData: function(){
      this.url =`/api/productos/${this.id}`
      axios.get(this.url)
      .then( res =>{
        this.producto= res.data
      })
      .catch((error)=>{console.log(error)})
  },

}
}).mount("#app")
