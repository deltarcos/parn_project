<template>
  <v-app>
    
 

    <v-content>
      <!-- <Appointments/> -->
      <router-view />
    </v-content>
  </v-app>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
    username: 'Dr.Too Poptorn',
    drawer:true
    }
  },
  methods: {
    gohome(){
      this.$router.push('/');
    }
  }
}
</script>