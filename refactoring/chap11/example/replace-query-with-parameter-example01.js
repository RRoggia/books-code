class HeatingPlan {
  constructor( thermostat ) {
    this._max = 100
    this._min = 0
    this.thermostat = thermostat
  }
  get targetTemperature() {
    if ( thermostat.selectedTemperature >  this._max ) {
      return this._max
    }
    else if ( thermostat.selectedTemperature <  this._min ) {
      return this._min
    }
    else {
      return thermostat.selectedTemperature
    }
  }
}

function setThermostatTemperature( thePlan, thermostat ) {
  if ( thePlan.targetTemperature > thermostat.currentTemperature ) {
    setToHeat()
  } else if ( thePlan.targetTemperature < thermostat.currentTemperature ) {
    setToCool()
  } else {
    setOff()
  }
}

function setToHeat() {
  console.log( 'heating...' )
}

function setToCool() {
  console.log( 'cooling...' )
}

function setOff() {
  console.log( 'turning off...')
}

const thermostat = { currentTemperature: 30, selectedTemperature: 50 }
const heatingPlan = new HeatingPlan( thermostat )
setThermostatTemperature( heatingPlan, thermostat )