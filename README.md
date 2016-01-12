
# Counter - service

### Description:

The counter-service supports this API's:
- Create a counter
- Add 1 to the counter
- Subtract 1 the from counter
- Get the counter details.


### Responses
- The response json will be hold 2 main attributes:

##### responseObject: 
- a response object which will contains the actual response.

##### responseStatus: 
- an int which will represent the status of the response, 0 on success, non 0 otherwise.

### API's

##### Create a counter:
Description:
- Will create a new counter initialize with countValue 0.

Path: 
- POST /counters/

responseObject: 
- id = the id of the counter.
- counterValue = the current value of the counter.

Example of a successful response: 
```json
{
	"responseObject": {
		"id": "5693f2fad4c6132bd88af014",
		"counterValue": 0
	},
	"responseStatus": 0
}
```

##### Add 1 to counter
Description:
- Will add 1 to the counters current counterValue

Path: 
- POST /counters/{id}/add

responseObject: 
- id = the id of the counter.
- counterValue = the current value of the counter.

Example of a successful response: 
```json
{
	"responseObject": {
		"id": "5693f2fad4c6132bd88af014",
		"counterValue": 1
	},
	"responseStatus": 0
}
```

Example of a bad response - 404 not found: 
```json
{
	"responseObject": {
		"errorDescription" : "counterId: 5693f2fad4c6132bd88af014 was not found, please check you id and try again"
	},
	"responseStatus": 1001
}
```

##### Subtract 1 from the counter
Description:
- Subtract 1 from the counters current counterValue

Path: 
- POST /counters/{id}/Subtract

responseObject: 
- id = the id of the counter.
- counterValue = the current value of the counter.

Example of a successful response: 
```json
{
	"responseObject": {
		"id": "5693f2fad4c6132bd88af014",
		"counterValue": 0
	},
	"responseStatus": 0
}
```

Example of a bad response - 404 not found: 
```json
{
	"responseObject": {
		"errorDescription" : "counterId: 5693f2fad4c6132bd88af014 was not found, please check you id and try again"
	},
	"responseStatus": 1001
}
```

##### Get the counter details
Description:
- Get the counter current details

Path: 
- GET /counters/{id}

responseObject: 
- id = the id of the counter.
- counterValue = the current value of the counter.

Example of a successful response: 
```json
{
	"responseObject": {
		"id": "5693f2fad4c6132bd88af014",
		"counterValue": 0
	},
	"responseStatus": 0
}
```

Example of a bad response - 404 not found: 
```json
{
	"responseObject": {
		"errorDescription" : "counterId: 5693f2fad4c6132bd88af014 was not found, please check you id and try again"
	},
	"responseStatus": 1001
}
```


### List of error codes:

- 1001 - wasn't found in our db, please check or contact support. 
