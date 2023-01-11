'use strict';

import * as plantUrl from '/scripts/url.js';

const populatePlantTypesSelect = function() {
    $.get(plantUrl.getBaseUrl() + 'api/plant-types/').done(function (plantTypes) {
        const $plantTypeId = $('#plantTypeId');
        plantTypes.forEach(function (plantTypes) {
            $plantTypeId.append('<option value="' + plantTypes.id + '">' + plantTypes.typeName + '</option>');
        });
    });
};

$(document).ready(function() {
    populatePlantTypesSelect();

    $('#addProfileBtn').click(function () {
        $.post(plantUrl.getBaseUrl() + 'api/profile/', {
            commonName: $('#commonName').val(),
            genusName: $('#genusName').val(),
            description: $('#description').val(),
            plantTypeId: $('#plantTypeId').val()
        })
            .done(function () {
                window.location.href = '/index.html';
            });
    });
});