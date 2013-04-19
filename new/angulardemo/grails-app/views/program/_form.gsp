<%@ page import="angulardemo.Program" %>



<div class="fieldcontain ${hasErrors(bean: programInstance, field: 'campaigns', 'error')} ">
	<label for="campaigns">
		<g:message code="program.campaigns.label" default="Campaigns" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${programInstance?.campaigns?}" var="c">
    <li><g:link controller="campaign" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="campaign" action="create" params="['program.id': programInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'campaign.label', default: 'Campaign')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: programInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="program.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${programInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: programInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="program.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${programInstance?.name}"/>
</div>

