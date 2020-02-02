<template>
  
  <v-container>

    
<img width="1100px"v-for="img in images" v-bind:src="img"/>

  <v-container>
            <div v-if="qFound"> 
                <v-alert  outlined dense text type="warning" prominent border="left" > <strong>ไม่พบข้อมูล</strong> โปรดตรวจสอบข้อมูลอีกครั้ง </v-alert>
            </div>

    </v-container>


    <v-layout >
      <v-flex mb-1>
        <br />
        <h1>Library FAQs</h1>
      </v-flex>
    </v-layout>

    <v-row >

      
      <v-col>
        <v-form v-model="valid" ref="form">
          <v-row justify="center">

            <v-col>
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
                  <v-text-field block   label="คำถาม" v-model="question.q"></v-text-field>
              </v-col>
            </v-row>

            <v-row justify="center">
              <img width="800px"v-for="img in answer_photo" v-bind:src="img"/>
            </v-row>

            <br />
          </div>

<div v-if="bord" class="row">
            <div class="col-md-6">
                <div class="rounded" style="border:1px solid #000000;">
                    <table class="table table-condensed">
                        <tbody><tr>
                          <br />
                            <ul><h5 @click="v1 = !v1" >	► Line bot</h5></ul>
                            <div v-if="v1">
                            <a href="#"><ul><ul>► การลงทะเบียน Line bot</ul></ul></a>    
                            <a href="#"><ul><ul>► การแจ้งเตือน Line bot</ul></ul></a>
                            <a href="#"><ul><ul>► ปัญหาการใช้/ วิธีใช้ Line bot</ul></ul></a></div>
                        </tr>

                        <tr>
                            <ul><h5 @click="v2 = !v2" >► การเข้าใช้บริการ </h5></ul>
                            <div v-if="v2">
                            <a href="#"><ul><ul><div >► การเข้าใช้บริการของบุคคลภายนอก</div></ul></ul></a>    
                            <a href="#"><ul><ul><div >► การเข้าใช้บริการของนิสิต</div></ul></ul></a>
                             <a href="#"><ul><ul><div >► การเข้าใช้บริการของศิษย์เก่า</div></ul></ul></a>
                             </div>
                        </tr>
                        
                        <tr>
                            <ul><h5 @click="v3 = !v3" >► กฎ ระเบียบ ข้อบังคับหอสมุด </h5></ul>
                              <div v-if="v3">
                                <a href="#"><ul><ul>► การแต่งกาย</ul></ul></a>
                            </div>
                        </tr>

                        <tr>
                            <ul><h5 @click="v4 = !v4" >► การประชาสัมพันธ์ข่าวสารและกิจกรรมต่างๆ </h5></ul>
                             <div v-if="v4">
                               <a href="#"><ul><ul>► การบริจาคหนังสือ</ul></ul></a>
                                <a href="#"><ul><ul>► ช่องทางการติดตามหนังสือใหม่</ul></ul></a>
                                  <a href="#"><ul><ul>► การอบรมสารสนเทศ</ul></ul></a>
                              </div>
                        </tr>


                        <tr>
                           <ul><h5 @click="v5 = !v5" >► การยืม - คืน </h5></ul>
                            <div v-if="v5">
                            <a href="#"><ul><ul>► การคืนหนังสือด้วย Book Sorter </ul></ul></a>
                            <a href="#"><ul><ul>► การคืนหนังสือเกินกำหนด </ul></ul></a>
                            <a href="#"><ul><ul>► การจองหนังสือออนไลน์ </ul></ul></a>
                            <a href="#"><ul><ul>► การชำระค่าปรับ </ul></ul></a>
                            <a href="#"><ul><ul>► การยืม-คืนหนังสือ </ul></ul></a>
                            <a href="#"><ul><ul>► การยืม-คืนหนังสือของศิษย์เก่า</ul></ul></a>
                            <a href="#"><ul><ul>► การยืม-คืนหนังสือของนิสิต</ul></ul></a>
                            <a href="#"><ul><ul>► การยืม-คืนหนังสือของบุคคลากร</ul></ul></a>
                            <a href="#"><ul><ul>► การยืม-คืนหนังสือของบุคคลภายนอก </ul></ul></a>
                            <a href="#"><ul><ul>► การยืม-คืนแบบด่วน </ul></ul></a>
                            <a href="#"><ul><ul>► การยืมหนังสือแบบไม่อั้น </ul></ul></a>
                            <a href="#"><ul><ul>► การยืมหนังสือระหว่างห้องสมุด </ul></ul></a>
                            <a href="#"><ul><ul>► การยืมหนังสือใหม่  </ul></ul></a>
                            <a href="#"><ul><ul>► การใช้บริการ Quick Service  </ul></ul></a>
                            <a href="#"><ul><ul>► ประเภทหนังสือที่สามารถยืม-คืนได้  </ul></ul></a>
                            <a href="#"><ul><ul>► สถานที่ที่สามารถยืม-คืนหนังสือได้  </ul></ul></a>
                            <a href="#"><ul><ul>► ระบบตรวจสอบประวัติการการยืม-คืนหนังสือ </ul></ul></a>
                            </div>
                        </tr>

                        <tr>
                             <ul><h5 @click="v6 = !v6" >► การสืบค้นฐานข้อมูลจากภายนอกเครือข่าย </h5></ul>
                             <div v-if="v6">
                             <a href="#"><ul><ul>► การดาวน์โหลดนอกมหาวิทยาลัย  </ul></ul></a>
                             <a href="#"><ul><ul>► การเชื่อมต่อฐานข้อมูลนอกมหาวิทยาลัย  </ul></ul></a>
                             <a href="#"><ul><ul>► การสืบค้นในฐานข้อมูลกรณีอยู่นอกบริเวณมหาวิทยาลัย</ul></ul></a>
                             </div>
                        </tr>
                        <tr>
                            <ul><h5 @click="v7 = !v7" >► การสืบค้นทรัพยากรสารสนเทศ </h5></ul>
                            <div v-if="v7">
                                 <a href="#"><ul><ul>► การสืบค้นทาง Opac </ul></ul></a>
                                 <a href="#"><ul><ul>► การสืบค้นงานวิจัย</ul></ul></a>
                                 <a href="#"><ul><ul>► การสืบค้นวิทยานิพนธ์ </ul></ul></a>
                                 <a href="#"><ul><ul>► การสืบค้นวารสาร  </ul></ul></a>
                                 <a href="#"><ul><ul>► การสืบค้นหนังสือ  </ul></ul></a>
                                 <a href="#"><ul><ul>► การสืบค้นบทความ </ul></ul></a>
                                 <a href="#"><ul><ul>► การสืบค้นหนังสือพิมพ์  </ul></ul></a>
                                 <a href="#"><ul><ul>► ตำแหน่งของหนังสือ  </ul></ul></a>
                              </div>
                        </tr>


                        <tr>
                            <ul><h5 @click="visible = !visible" >► ความหมายของคำศัพท์ </h5></ul>
                        </tr>

                        <tr>
                            <ul><h5 @click="visible = !visible" >► ข้อมูลทั่วไป </h5></ul>
                        </tr>


                        <tr>
                            <ul><h5 @click="visible = !visible" >► กิจกรรมจิตอาสา </h5></ul>
                        </tr>

                        <tr>
                           <ul><h5 @click="visible = !visible" >► ซอฟแวร์ทั่วไป </h5></ul>
                        </tr>
                        <tr>
                         <ul><h5 @click="visible = !visible" >► ฐานข้อมูลออนไลน์ </h5></ul>
                         </tr>

                    </tbody></table>
                </div>
            </div>
            <div class="col-md-6">
                <div class="rounded" style="border:1px solid #000000;">
                    <table class="table table-condensed">
                        <tbody>  <br />
                           <ul><h2><strong>5 ข้อมูลเบื้องต้นที่ควรรู้</strong></h2></ul>
                          <tr>

                            <ul><h5 @click="v1 = !v1" >	► เวลาเปิด-ปิดของสำนักหอสมุดมหาวิทยาลัยนเรศวร</h5></ul>
                        </tr>

                        <tr>
                            <ul><h5 @click="v2 = !v2" >► สถานที่ยืม – คืน </h5></ul>
                        </tr>
                        
                        <tr>
                            <ul><h5 @click="v3 = !v3" >► การชำระค่าปรับ </h5></ul>
                        </tr>

                        <tr>
                            <ul><h5 @click="v3 = !v3" >► ค่าสมัครสมาชิก </h5></ul>
                        </tr>

                        <tr>
                            <ul><h5 @click="findCustom('Line bot ใช้ยังไงคะ')">► การลงทะเบียน Line bot </h5></ul>
                        </tr>
                    </tbody></table>
                </div>
            </div>
        </div>

         
           <br />
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
      visible: false,
      bord:true,
      v1:false,
      v2:false,
      v3:false,
      v4:false,
      v5:false,
      v6:false,
      v7:false,
      images:['https://www.mx7.com/i/2aa/3HO6kr.PNG'],
      answer_photo:[]
    };
  },
  methods: {
    /* eslint-disable no-console */
    findCustom(q){
        this.question.q_s = q;
        this.findQ();
    },
    /* eslint-disable no-console */
    findQ() {
          console.log(this.question.q_s);this.qFound = false;
            http
                .get("/question/question/" + this.question.q_s)
                .then(response => {
                    console.log(response);
                    if (response.data[0] != null) {
                        this.question.q = response.data[0].q;
                        this.question.q_id = response.data[0].id;
                        this.answer_photo[0] = response.data[0].a;
                        this.drugFound = false;
                        this.qCheck = true;
                        console.log(this.question.q);
                        console.log(this.question.q_id);
                        console.log(this.answer_photo);
                        this.bord = false;


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
      this.bord = false;
      this.v1 = false;
      this.v2 = false;
      this.v3= false;
      this.v5=false;
      this.v6=false;
      this.v7=false;
    },




  },

};
</script>
