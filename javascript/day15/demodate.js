// List all IANA time zones
console.log(Intl.supportedValuesOf('timeZone'));
let currenttime=new Intl.DateTimeFormat("en-US",{timeZone:"America/Chicago",timeStyle:"medium",dateStyle:"long"}).format(new Date());
 
console.log(currenttime);
