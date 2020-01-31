<template>
  <v-container>

  <v-container>
            <div v-if="qFound"> 
                <v-alert  outlined dense text type="warning" prominent border="left" > <strong>ไม่พบข้อมูล</strong> โปรดตรวจสอบข้อมูลอีกครั้ง </v-alert>
            </div>

    </v-container>


    <v-layout text-center wrap>
      <v-flex mb-4>
        <br />
        <h1 class="display-2 font-weight-bold mb-3">ค้นหา</h1>
      </v-flex>
    </v-layout>

    <v-row justify="center">
      <v-col cols="4">
        <v-form v-model="valid" ref="form">
          <v-row justify="center">
            <v-col cols="10">


              <v-text-field
                outlined
                label="สิ่งที่จะค้นหา"
                v-model="question.q_s"
                :rules="[(v) => !!v || 'Item is required']"
                required
              ></v-text-field>

            </v-col>
            <v-col cols="2">
              <div class="my-2">
                <v-btn @click="findQ" depressed large color="primary">ค้นหา</v-btn>
              </div>
            </v-col>
          </v-row>

          <div v-if="qCheck">

            <v-row justify="center">
              <v-col cols="12">
                  <v-text-field block  prepend-icon="sort" label="Question" v-model="question.q"></v-text-field>
              </v-col>
            </v-row>

            <v-row justify="center">
              <v-col cols="12">
                  <v-text-field block  prepend-icon="sort" label="Answer" v-model="question.a"></v-text-field>
              </v-col>
            </v-row>

            <br />
          </div>
        </v-form>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import http from "../http-common";

export default {
  name: "ViewDrug",
  data() {
    return {
      question: {
        q_s:"",
        q_id:"",
        q: "",
        a: "",
      },
      valid: false,
      qCheck: false,
      qFound: false,
    };
  },
  methods: {
    /* eslint-disable no-console */
    findQ() {
          console.log(this.question.q_s);this.qFound = false;
            http
                .get("/question/question/" + this.question.q_s)
                .then(response => {
                    console.log(response);
                    if (response.data[0] != null) {
                        this.question.q = response.data[0].q;
                        this.question.a = response.data[0].a;

                        this.drugFound = false;
                        this.qCheck = true;
                        console.log(this.question.q);
                        console.log(this.question.a);


                    } else {
                        this.clear();
                        this.qFound = true;
                        this.qCheck = false;
     
                    }
                })
                .catch(e => {
                    console.log(e);
                });
            this.submitted = true;
  
  },
  clear() {
      this.$refs.form.reset();
      this.qCheck = false;
      this.qFound = false;
    },




  },

};
</script>
