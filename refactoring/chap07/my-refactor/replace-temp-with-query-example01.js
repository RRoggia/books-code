class Order {
  constructor( quantity, item ) {
    this._quantity = quantity
    this._item = item
  }

  get basePrice() {
    return this._quantity * this._item.price
  }

  get discountFactor() {
    let discountFactor = 0.98 

    if ( this.basePrice > 1000 ) {
      discountFactor - 0.03
    }
    return discountFactor
  }

  price() {
      return this.basePrice * this.discountFactor
  }
}

const orderA = new Order( 10, { price: 1.20 } )
console.log( `Base price is ${ orderA.price() }` )