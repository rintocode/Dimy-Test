<template>
  <div class="App">
    <button class="new-button" @click="newButtonClickHandler">New</button>
    <div v-for="(row, index) in rowInput" :key="row" class="row-input">
      <div class="column-input">
        <label for="product_name">Product name</label>
        <input
          type="text"
          name="product_name"
          :value="form[index].product_name"
          @input="onchangeHandler($event, index)"
        />
      </div>
      <div class="column-input">
        <label for="product_price">Product price</label>
        <input
          type="number"
          name="product_price"
          :value="form[index].product_price"
          @input="onchangeHandler($event, index)"
        />
      </div>
      <div class="column-input">
        <label for="quantity">Qty</label>
        <input
          type="number"
          name="quantity"
          :value="form[index].quantity"
          @input="onchangeHandler($event, index)"
        />
        <div class="error" :id="'qty-validator' + index">Qty must be greater than 0</div>
      </div>
      <div class="column-input">
        <label for="total">Total</label>
        <input type="number" name="total" :value="form[index].total" @input="onchangeHandler($event, index)" />
      </div>
      <div class="delete-button" :class="{ hidden: row === rowInput.length && rowInput.length !== 1 }">
        <button @click="deleteButtonClickHandler(index)">Delete</button>
      </div>
    </div>
    <div class="row-input grand-total">
      <div class="column-input"></div>
      <div class="column-input"></div>
      <div class="column-input"></div>
      <div class="column-input">
        <label for="total">Grand Total</label>
        <input type="number" :value="grandTotal" />
      </div>
      <div class="delete-button"></div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      rowInput: [1],
      form: [
        {
          product_name: '',
          product_price: null,
          quantity: 1,
          total: null,
        },
      ],
      grandTotal: 0,
    };
  },
  methods: {
    newButtonClickHandler() {
      this.rowInput.push(this.rowInput.length + 1);
      this.form.push({
        product_name: '',
        product_price: null,
        quantity: 1,
        total: null,
      });
    },
    deleteButtonClickHandler(index) {
      this.rowInput.splice(index, 1);
      this.form.splice(index, 1);
    },
    onchangeHandler(e, index) {
      const { name, value } = e.target;
      const list = [...this.form];
      list[index][name] = value;
      list[index].total = list[index].product_price * list[index].quantity;
      this.grandTotal = 0;
      this.form.forEach((item) => {
        this.grandTotal += item.total;
      });
      this.form = list;

      if (name === 'quantity') {
        if (value < 1) {
          document.getElementById(`qty-validator${index}`).style.display = 'block';
        } else {
          document.getElementById(`qty-validator${index}`).style.display = 'none';
        }
      }
    },
  },
};
</script>

<style scoped>
.App {
  margin: 20px 300px;
  padding: 10px;
}

.new-button{
  background-color: gray;
  color: white;
  font-weight: bold;
  border: none;
  border-radius: 4px;
  padding: 8px;
  margin-bottom: 20px;
}

.row-input{
  display: flex;
  justify-content: space-between;
  margin-bottom: 10px;
}

.column-input{
  width: 20%;
}

.column-input input{
  width: 90%;
  padding: 5px 10px;
  border-radius: 5px;
  border: 2px solid gray;
}

.delete-button{
  width: 10%;
  display: flex;
  align-items: flex-end;
}

.delete-button button{
  padding: 5px 10px;
  border-radius: 5px;
  border: none;
  background-color: rgb(227, 6, 6);
  color: white;
}

.hidden{
  visibility: hidden;
}

.grand-total{
  margin-top: 50px;
}

.error{
  margin-top: 2px;
  background-color: rgba(255, 0, 0, 0.7);
  color : white;
  padding: 2px;
  display: none;
  border-radius: 2px;
  font-size: 14px;
  width: 100%;
}
</style>
