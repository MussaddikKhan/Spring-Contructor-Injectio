

@Autowiring ,@Qualifier and @Primary Annotation with Constructor Injection 

Injection Types 
• Constructor Injection
	• Use this when you have required dependencies
	• Generally recommended by the spring.io development team as first choice


Autowiring 
• Injecting a Coach implementation
• Spring will scan @Components
• Any one implements HomeWork interface???
• If so, let’s inject them (But If Multiple Classes are implement them then there is an amiguity for this we have two moer annotations i.e @Qualifiers and @Primary. 

Which one to use : @Primary or @Qualifier?
• @Primary leaves it up to the implementation classes
• Could have the issue of multiple @Primary classes leading to an error
• @Qualifier allows to you be very specific on which bean you want
• In general, I recommend using @Qualifier
• More specific
• Higher priority
